package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLines = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> peopleCarPlateMap = new LinkedHashMap<>();

        for (int i = 0; i < inputLines; i++) {
            // Разделям входа на части
            String input = scanner.nextLine();
            String[] inputArr = input.split("\\s+");
            String command = inputArr[0];
            String name = inputArr[1];

            switch (command) { // <- Търся по командата

                case "register":
                    String carPlate = inputArr[2]; // <- На register има и рег. номер

                    if (peopleCarPlateMap.containsKey(name)) { // <- Ако вече съществува

                        System.out.printf("ERROR: already registered with plate number %s%n"
                                , peopleCarPlateMap.get(name));


                    } else { // <- Ако не съществува

                        // Добавям името и рег. номер
                        peopleCarPlateMap.put(name, carPlate);
                        System.out.printf("%s registered %s successfully%n"
                                , name, peopleCarPlateMap.get(name));

                    }

                    break;

                case "unregister":

                    if (!peopleCarPlateMap.containsKey(name)) { // <- Ако няма такова име регистрирано

                        System.out.printf("ERROR: user %s not found%n", name);

                    } else { // <- Ако има го премахвам

                        peopleCarPlateMap.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);

                    }

                    break;

            }

        }

        for (Map.Entry<String, String> entry : peopleCarPlateMap.entrySet()) {

            System.out.println(entry.getKey() + " => " + entry.getValue());

        }

    }

}
