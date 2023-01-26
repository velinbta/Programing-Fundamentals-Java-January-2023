package List;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам списък от Double числа
        List<Double> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toList());

        // Цикълът е до предпоследния елемент, защото в проверката се използва
        // един елемент напред
        for (int i = 0; i < numList.size() - 1; i++) {

            // Ако са еднакви елементите от i и i + 1:
            if (numList.get(i).equals(numList.get(i + 1))) {

                // Събирам ги, поставям ги на текущото място на i,
                // трия елемента и връщам цикъла 1 позиция назад
                double sum = numList.get(i) + numList.get(i + 1);
                numList.set(i, sum);
                numList.remove(i + 1);

                i = -1;

            }

        }


        for (Double list : numList) {
            // DecimalFormat ми оставя дробните - дробни, целите - цели
            DecimalFormat df = new DecimalFormat("0.####");
            System.out.print(df.format(list) + " ");

        }


    }

}
