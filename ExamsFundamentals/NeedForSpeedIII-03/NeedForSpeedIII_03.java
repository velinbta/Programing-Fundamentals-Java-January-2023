package ExamsFundamentals;

import java.util.*;

public class NeedForSpeedIII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int availableCars = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> carMileageMap = new LinkedHashMap<>(); // <- Коли, километраж
        Map<String, Integer> carFuelMap = new HashMap<>(); // <- Коли, гориво

        for (int i = 0; i < availableCars; i++) {

            // Извеждам данните и запълвам двата Map
            String[] infoArr = scanner.nextLine().split("\\|");
            String car = infoArr[0];
            int mileage = Integer.parseInt(infoArr[1]);
            int fuel = Integer.parseInt(infoArr[2]);

            carMileageMap.putIfAbsent(car, mileage);
            carFuelMap.putIfAbsent(car, fuel);

        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            String[] infoArr = input.split("\\s*:\\s*");
            String command = infoArr[0];
            String car = infoArr[1];

            switch (command) {

                case "Drive":

                    int distance = Integer.parseInt(infoArr[2]);
                    int fuel = Integer.parseInt(infoArr[3]);

                    boolean hasEnoughFuel = carFuelMap.get(car) - fuel >= 0; // <- Ако има достатъчно гориво

                    if (hasEnoughFuel) {

                        carFuelMap.put(car, carFuelMap.get(car) - fuel); // <- Изваждам горивото
                        carMileageMap.put(car, carMileageMap.get(car) + distance); // <- Слагам изминатите км

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",
                                car, distance, fuel);

                        if (carMileageMap.get(car) >= 100000) {
                            // Ако навърти повече от 100 000, се продава и премахва от колекцията
                            System.out.printf("Time to sell the %s!\n", car);
                            carMileageMap.remove(car);
                            carFuelMap.remove(car);

                        }

                    } else { // <- Ако няма да стигне горивото

                        System.out.println("Not enough fuel to make that ride");

                    }

                    break;

                case "Refuel":

                    int givenFuel = Integer.parseInt(infoArr[2]);

                    // Ако може да побере горивото, което се дава
                    boolean canHoldGivenFuel = carFuelMap.get(car) + givenFuel <= 75;

                    if (canHoldGivenFuel) {

                        carFuelMap.put(car, carFuelMap.get(car) + givenFuel); // <- Ако го побира, се зарежда цялото
                        System.out.printf("%s refueled with %d liters\n", car, givenFuel);

                    } else {
                        // Ако не може да побере даденото гориво - се зарежда до 75 литра
                        System.out.printf("%s refueled with %d liters\n", car, 75 - carFuelMap.get(car));
                        carFuelMap.put(car, 75);

                    }


                    break;

                case "Revert":

                    int decreasingKm = Integer.parseInt(infoArr[2]);

                    // Ако след превъртането на километража, автомобила стане по-малко от 10 000
                    boolean isMileageLessThan10000 = carMileageMap.get(car) - decreasingKm < 10000;

                    if (isMileageLessThan10000) {

                        carMileageMap.put(car, 10000); // <- Въвежда се 10 000

                    } else { // <- Ако е повече от 10 000, просто се изваждат от общия километраж

                        carMileageMap.put(car, carMileageMap.get(car) - decreasingKm);

                        System.out.printf("%s mileage decreased by %d kilometers\n", car, decreasingKm);

                    }

                    break;

            }

            input = scanner.nextLine();

        }

        carMileageMap.entrySet().forEach(car ->
                System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",
                        car.getKey(), car.getValue(), carFuelMap.get(car.getKey())));

    }

}
