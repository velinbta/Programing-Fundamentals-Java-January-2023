package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences_03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toLowerCase() - case insensitive
        String[] wordsArr = scanner.nextLine().toLowerCase().split("\\s+");

        LinkedHashMap<String, Integer> wordOccurrencesMap = new LinkedHashMap<>();
        // Добавям всички срещания на думите
        for (String current : wordsArr) {
            wordOccurrencesMap.putIfAbsent(current, 0); // <- Добавям, ако я няма думата с първоначални 0 срещания
            wordOccurrencesMap.put(current, wordOccurrencesMap.get(current) + 1); // + 1 на всяко срещане
        }

        // Филтрирам в нов Map, само тези, който се срещат нечетен брой пъти
        LinkedHashMap<String, Integer> oddOccurrencesMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> current : wordOccurrencesMap.entrySet()) {

            if (current.getValue() % 2 != 0) {
                oddOccurrencesMap.put(current.getKey(), current.getValue());
            }

        }

        int size = oddOccurrencesMap.size();
        int i = 0;
        // На последна итерация на слагам запетая
        for (Map.Entry<String, Integer> current : oddOccurrencesMap.entrySet()) {
            i++;
            if (size != i) {

                System.out.printf("%s, ", current.getKey());

            } else {

                System.out.printf("%s", current.getKey());

            }

        }

    }

}

