package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // От кондолата се четат два списъка
        List<String> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        List<String> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        // Създавам трети, който ще ми държи резултата
        List<String> resultList = new ArrayList<>();

        // Взимам размера на по-късия списък и добавям елементите
        // от първия и втория в третия
        int minSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSize; i++) {

            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));

        }

        //  В зависимост, кой е по-дълъг списък -
        //  правя subList и добавям оставащите елементи
        if (firstList.size() > secondList.size()) {

            resultList.addAll(firstList.subList(minSize, firstList.size()));

        } else {

            resultList.addAll(secondList.subList(minSize, secondList.size()));

        }

        System.out.print(resultList.toString().replaceAll("[\\[\\],]", ""));

    }

}
