package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // От кондолата се четат два списъка
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        // Съхранявам, големината на по-дългия и по-късия
        int max = Math.max(firstList.size(), secondList.size());
        int min = Math.min(firstList.size(), secondList.size());

        // Създавам трети, който ще ми държи резултата
        List<Integer> resultList = new ArrayList<>();

        // Обхождам първо по-малкия списък
        for (int i = 0; i < min; i++) {

            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));

        }

        // Вече от по-късия спикък до по-дългия, добавям останалите елементи
        for (int i = min; i < max; i++) {

            if (firstList.size() > secondList.size()) {

                resultList.add(firstList.get(i));

            } else {

                resultList.add(secondList.get(i));

            }

        }

        resultList.forEach(e -> System.out.print(e + " "));

    }

}
