package AssociativeArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(e -> Double.parseDouble(e)).toArray();

        TreeMap<Double, Integer> numOccurrenceMap = new TreeMap<>();

        for (double current : numArr) { // <- Обхождам масива

            numOccurrenceMap.putIfAbsent(current, 0); // <- Слагам, ако го няма и първоначално 0 срещания
            numOccurrenceMap.put(current, numOccurrenceMap.get(current) + 1); // + 1 на всяко срещане

        }

        for (Map.Entry<Double, Integer> current : numOccurrenceMap.entrySet()) {
            // Принтирам int като int, double като double
            DecimalFormat df = new DecimalFormat("0.####");
            System.out.println(df.format(current.getKey()) + " -> " + current.getValue());

        }

    }

}
