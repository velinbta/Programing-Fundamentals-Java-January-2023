package AssociativeArrays;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_01_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> doubleList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Double.parseDouble(e)).collect(Collectors.toList());

        TreeMap<Double, Integer> numOccurrenceMap = new TreeMap<>();

        doubleList.forEach(e -> {
            numOccurrenceMap.putIfAbsent(e, 0); // <- Слагам, ако го няма и първоначално 0 срещания
            numOccurrenceMap.put(e, numOccurrenceMap.get(e) + 1); // + 1 на всяко срещане
        });

        numOccurrenceMap.entrySet().forEach(entry -> {
            // Принтирам int като int, double като double
            DecimalFormat df = new DecimalFormat("0.####");
            System.out.println(df.format(entry.getKey()) + " -> " + entry.getValue());

        });

    }

}
