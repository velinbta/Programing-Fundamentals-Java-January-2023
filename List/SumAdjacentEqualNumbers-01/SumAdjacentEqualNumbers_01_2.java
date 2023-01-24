package ListLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам списък от Double числа
        List<Double> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Double.parseDouble(e)).collect(Collectors.toList());

        int i = 0; // От тук ще контролирам елементите в списъка

        // Докато е по-малко от предпоследната позиция,
        // защото в проверката се използва един елемент напред
        while (i < numList.size() - 1) {

            if (numList.get(i).equals(numList.get(i + 1))) {
                // Ако са равни ги събирам, трия елемента и поставям сбора на това място
                double sum = numList.get(i) + numList.get(i + 1);
                numList.remove(i);
                numList.set(i, sum);
                i = 0;

            } else {
               // Ако не са равни отивам една позиция напред
                i++;

            }

        }

        // Обхождам и принтирам всеки елемент от листа
        numList.forEach(e -> {
            // DecimalFormat ми оставя дробните - дробни, целите - цели
            DecimalFormat df = new DecimalFormat("0.####");
            System.out.print(df.format(e) + " ");
        });


    }
}
