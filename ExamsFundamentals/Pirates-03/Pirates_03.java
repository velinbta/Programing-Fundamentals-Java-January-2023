package ExamsFundamentals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Long> cityPopulationMap = new LinkedHashMap<>();
        Map<String, Long> cityGoldMap = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")) {

            // Извличам информацията и попълвам двата Map-а
            String[] infoArr = input.split("\\|\\|");
            String city = infoArr[0];
            long population = Long.parseLong(infoArr[1]);
            long gold = Long.parseLong(infoArr[2]);

            // Първоначални стойности
            cityPopulationMap.putIfAbsent(city, 0L);
            cityGoldMap.putIfAbsent(city, 0L);

            // При всяко срещане им увеличавам популация/злато
            cityPopulationMap.put(city, cityPopulationMap.get(city) + population);
            cityGoldMap.put(city, cityGoldMap.get(city) + gold);

            input = scanner.nextLine();

        }

        input = scanner.nextLine();
        while (!input.equals("End")) {

            String[] infoArr = input.split("=>");
            String command = infoArr[0];
            String city = infoArr[1];

            if (cityPopulationMap.containsKey(city)) { // <- Ако изобщо дадения град се съдържа в Map

                switch (command) { // <- Търся спрямо командата

                    case "Plunder": {

                        long people = Long.parseLong(infoArr[2]);
                        long gold = Long.parseLong(infoArr[3]);

                        // Изваждам убитите хора и плячката от злато
                        cityPopulationMap.put(city, cityPopulationMap.get(city) - people);
                        cityGoldMap.put(city, cityGoldMap.get(city) - gold);

                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", city,
                                gold, people);

                        // Ако някой от градовете остане без население или злато - се премахва
                        if (cityPopulationMap.get(city) <= 0L || cityGoldMap.get(city) <= 0L) {

                            cityPopulationMap.remove(city);
                            cityGoldMap.remove(city);

                            System.out.printf("%s has been wiped off the map!\n", city);

                        }

                        break;

                    } case "Prosper": {

                        long gold = Long.parseLong(infoArr[2]);

                        if (gold < 0L) { // <- Ако е отрицателна стойноста се пропуска командата

                            System.out.println("Gold added cannot be a negative number!");

                        } else { // <- Добавя се златото в съответния град

                            cityGoldMap.put(city, cityGoldMap.get(city) + gold);
                            System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n",
                                    gold, city, cityGoldMap.get(city));

                        }

                        break;

                    }

                }

            }

            input = scanner.nextLine();

        }

        printPopulationLeftIfThereIsAny(cityPopulationMap, cityGoldMap); // <- Оставащи градове, популация и злато

    }

    private static void printPopulationLeftIfThereIsAny(Map<String, Long> cityPopulationMap,
                                                        Map<String, Long> cityGoldMap) {

        // Принтира оставащите градове, с тяхното население и злато
        if (cityPopulationMap.isEmpty())
            // Ако няма останали
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        else

            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n",
                    cityPopulationMap.size());

        cityPopulationMap.entrySet().forEach(city ->
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n"
                        , city.getKey(), city.getValue(), cityGoldMap.get(city.getKey())));

    }

}
