package vehicleCatalogue_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // <- Вход - {typeOfVehicle} {model} {color} {horsepower}

        List<Vehicle> vehicleList = new ArrayList<>(); // <- Списък с коли, от клас Vehicle

        // Четири променливи ще съдържат информация за конските сили и броя коли/камиони
        double carHorsepower = 0.0;
        double truckHorsepower = 0.0;
        int carCount = 0;
        int truckCount = 0;

        while (!input.equals("End")) {

            // Взимам частите на входа
            String[] inputArr = input.split("\\s+");
            String type = inputArr[0]; // <- Тип

            char upperCase = Character.toUpperCase(type.charAt(0));
            type = type.replace(type.charAt(0), upperCase); // <- Правя първата буква на типа - главна

            String model = inputArr[1]; // <- Модел
            String color = inputArr[2]; // <- Цвят
            int horsepower = Integer.parseInt(inputArr[3]);  // <- Конски сили

            // Правя нов обект от класа Vehicle и добавям в списъка
            Vehicle current = new Vehicle(type, model, color, horsepower);
            vehicleList.add(current);

            // В зависимост от типа, увеличавам брой и сумирам конските сили
            if (type.equals("Car")) {
                carCount++;
                carHorsepower += horsepower;
            } else if (type.equals("Truck")) {
                truckCount++;
                truckHorsepower += horsepower;
            }

            input = scanner.nextLine();

        }

        input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {

            for (Vehicle currentVehicle : vehicleList) {  // <- Търся по вече създадения списък с коли

                String model = currentVehicle.getModel();
                if (model.equals(input)) {  // <- Като намеря модела в списъка, принтирам данните му

                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n"
                            , currentVehicle.getType(), currentVehicle.getModel(), currentVehicle.getColor(), currentVehicle.getHorsepower());

                    break;

                }

            }

            input = scanner.nextLine();

        }

        // Изчислявам средната стойност на конските сили на автомобите и камионите
        // Ако нямам добавени такива - конските сили са със стойност 0.00
        if (carCount != 0) {

            double averageCarHorsepower = carHorsepower / carCount;
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHorsepower);

        } else {

            System.out.println("Cars have average horsepower of: 0.00.");

        }

        if (truckCount != 0) {

            double averageTruckHorsepower = truckHorsepower / truckCount;
            System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTruckHorsepower);

        } else {

            System.out.println("Trucks have average horsepower of: 0.00.");

        }

    }

}
