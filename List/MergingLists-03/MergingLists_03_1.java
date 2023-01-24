package ListLab;

import java.util.*;
import java.util.stream.Collectors;

public class MergingLists_03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // От кондолата се четат два списъка
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // Създавам трети, който ще ми държи резултата
        List<Integer> finalList = new ArrayList<>();
        int sizeMin = Math.min(firstList.size(), secondList.size());
        int sizeMax = Math.max(firstList.size(), secondList.size());

        int position; // position ми държи до кой елемент съм стигнал

        // Обхождам първо по-малкия списък
        for (position = 0; position < sizeMin; position++) {

            finalList.add(firstList.get(position));
            finalList.add(secondList.get(position));

        }

        // В зависимост кой от списъците е по-дълъг,
        // добавям крайните елементи в finalList
        if (firstList.size() > secondList.size()) {

            for (int j = sizeMin; j < sizeMax; j++) {

                finalList.add(firstList.get(position));
                position++;

            }

        } else {

            for (int j = sizeMin; j < sizeMax; j++) {

                finalList.add(secondList.get(position));
                position++;

            }

        }

        finalList.forEach(e -> System.out.print(e + " "));

    }
}
