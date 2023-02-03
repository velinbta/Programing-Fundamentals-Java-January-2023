package AssociativeArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(e -> Double.parseDouble(e)).toArray();

        TreeMap<Double, Integer> numOccurrenceMap = new TreeMap<>();

        for (int i = 0; i < numArr.length; i++) { // <- Обхождам масива

            double currentNumber = numArr[i]; // <-  Текущият елемент

            int occurrenceTotal = 0;  // <- Общо брой срещания в масива

            // Само ако не се среща, поставям числото и броя общо срещанията му
            if (!numOccurrenceMap.containsKey(currentNumber)) {

                for (double occurrence : numArr) {

                    if (currentNumber == occurrence) {

                        occurrenceTotal++;

                    }

                }

                numOccurrenceMap.put(currentNumber, occurrenceTotal);

            }

        }


        for (Map.Entry<Double, Integer> current : numOccurrenceMap.entrySet()) {
            // Принтирам int като int, double като double
            DecimalFormat df = new DecimalFormat("0.####");
            System.out.println(df.format(current.getKey()) + " -> " + current.getValue());

        }

    }

}
