package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences_03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = Arrays.stream(scanner.nextLine().toLowerCase().split("\\s+"))
                .collect(Collectors.toList()); // toLowerCase() - case insensitive

        LinkedHashMap<String, Integer> wordOccurrencesMap = new LinkedHashMap<>();

        wordsList.forEach(e -> {
            wordOccurrencesMap.putIfAbsent(e, 0); // <- Добавям, ако я няма думата с първоначални 0 срещания
            wordOccurrencesMap.put(e, wordOccurrencesMap.get(e) + 1); // + 1 на всяко срещане
        });
        wordsList.clear(); // <- Изтривам първоначалния списък

        wordOccurrencesMap.entrySet().forEach(entry -> {
            if (entry.getValue() % 2 != 0) {
                wordsList.add(entry.getKey()); // <- Прехвърлям в списъка думите, който са с нечен брой срещания
            }
        });

        System.out.println(wordsList.toString().replaceAll("[\\[\\]]", ""));

    }

}
