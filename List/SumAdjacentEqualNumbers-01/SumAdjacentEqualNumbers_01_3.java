package ListLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Съзвадам два списъка: Първия го прочитам от конзолата
        List<Double> initialList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Double.parseDouble(e)).collect(Collectors.toList());

        // Тук държа събраните чрез метода еднакви съседни елементи
        List<Double> nextList = sumAdjacentEqualNumbers(initialList);

        while (initialList.size() != nextList.size()) {
            // Докато са с различни размери - повтарям метода
            initialList = nextList;
            nextList = sumAdjacentEqualNumbers(initialList);

        }

        // Принтирам всеки елемент от първоначалния списък
        initialList.forEach(e -> {
            // DecimalFormat ми оставя дробните - дробни, целите - цели
            DecimalFormat df = new DecimalFormat("0.####");
            System.out.print(df.format(e) + " ");

        });


    }

    public static List<Double> sumAdjacentEqualNumbers(List<Double> initialList) {

        int i = 0; // С тази променлина, контролирам елементите в списъците

        // Използвам nextList за да си добавям вече събраните елементи
        List<Double> nextList = new ArrayList<>();

        while (i < initialList.size()) {

            // Използвам един елемент напред, затова и i < initialList.size() - 1
            if (i < initialList.size() - 1 && initialList.get(i).equals(initialList.get(i + 1))) {
                // Ако са равни ги добавям в nextList и минавам два елемента напред
                double sum = initialList.get(i) + initialList.get(i + 1);
                nextList.add(sum);
                i += 2;

            } else {
                // Ако не са равни минавам само 1 елементи напред и си добавям текущия
                nextList.add(initialList.get(i));
                i++;

            }

        }

        return nextList;

    }

}
