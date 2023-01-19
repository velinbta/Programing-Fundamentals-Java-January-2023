package RegularExpressionsExercises;

import java.util.*;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participantList = Arrays.stream(scanner.nextLine().split("\\s*,\\s*"))
                .collect(Collectors.toList()); // Получавам списък с участници

        String info = scanner.nextLine(); // Имена и километри, трябва да извлека от тук

        LinkedHashMap <String, Integer> nameKmMap = new LinkedHashMap<>(); // Съхранявам ги в Map
        while (!info.equals("end of race")) {

        StringBuilder name = new StringBuilder();
        int km = 0; // Общите километри
        for (char current: info.toCharArray()) {
            if (Character.isLetter(current)) {
                // Взимам само буквите
                name.append(current);
            } else if (Character.isDigit(current)) {
                // Взимам само отделните цифри и ги сумирам
                km += Character.getNumericValue(current);
            }
        }

        if (participantList.contains(name.toString())) {

            nameKmMap.putIfAbsent(name.toString(), 0); // Добавям го с първоначални 0 км
            nameKmMap.put(name.toString(), nameKmMap.get(name.toString()) + km); // Ако го срещна още пъти му добавям още км

        }

            info = scanner.nextLine();
        }

        String[] winnerArr = new String[3];
        // Използвам метод, който ми намира състезателя с най-много км, и му взимам името
        // След което състезателя се премехва и по този начин намерим следващия с най-много км
        winnerArr[0] = getNameBasedOnGreatestValue(nameKmMap);
        winnerArr[1] = getNameBasedOnGreatestValue(nameKmMap);
        winnerArr[2] = getNameBasedOnGreatestValue(nameKmMap);
        // Принтирам първите 3 места
        System.out.printf("1st place: %s%n",winnerArr[0]);
        System.out.printf("2nd place: %s%n",winnerArr[1]);
        System.out.printf("3rd place: %s%n",winnerArr[2]);


    }

    private static String getNameBasedOnGreatestValue(LinkedHashMap<String, Integer> nameKmMap) {

        String name = "";
        int max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry: nameKmMap.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                name = entry.getKey();
            }

        }
        nameKmMap.remove(name);

        return name;
    }

}


