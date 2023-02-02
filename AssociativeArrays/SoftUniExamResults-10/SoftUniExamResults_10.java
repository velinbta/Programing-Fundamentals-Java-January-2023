package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniExamResults_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Два асоциативни масива
        LinkedHashMap<String, Integer> namePointsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languageOccurrenceMap = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            // "{username}-{language}-{points}"
            String[] inputArr = input.split("-"); // <- Разделям входа на части
            String username = inputArr[0];// <- username на позиция 0

            if (!input.contains("banned")) {   // <- Ако в input НЕ СЕ съдържа думата "banned"
                // !input.split("-")[1].equals("banned")
                // Взимам частите на input
                String language = inputArr[1];
                int points = Integer.parseInt(inputArr[2]);

                // Слагам първоначално езика, ако не се съдържа с 0 срещания
                languageOccurrenceMap.putIfAbsent(language, 0);
                // На всяко срещане на езика, добавям по още 1 срещане
                languageOccurrenceMap.put(language, languageOccurrenceMap.get(language) + 1);

                // Втория асоциативен масив слагам потребитеря и правя проверка:
                // слагам най-високите му възможни точки
                namePointsMap.putIfAbsent(username, 0);
                if (namePointsMap.get(username) <= points) {

                    namePointsMap.put(username, points);

                }

            } else {  // <- Ако в input има думата "banned"

                namePointsMap.remove(username); // <- Премахвам username

            }

            input = scanner.nextLine();

        }

        // Принтирам първо точките, после срещанията на езика
        System.out.println("Results:");

        namePointsMap.entrySet().forEach(entry -> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));

        System.out.println("Submissions:");

        languageOccurrenceMap.entrySet().forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));

    }

}
