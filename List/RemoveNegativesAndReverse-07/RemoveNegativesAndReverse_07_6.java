package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // При прочитането на списъка, оставям числата по-големи или равни на 0
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).filter(e -> e >= 0).collect(Collectors.toList());

        // Обръщам реда им
        Collections.reverse(numList);

        // Ако не е празен списъка го принтирам
        if (numList.isEmpty()) {

            System.out.println("empty");

        } else {

            numList.forEach(e -> System.out.print(e + " "));

        }

    }

}
