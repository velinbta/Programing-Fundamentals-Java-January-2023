package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получавам списък с числа
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // Премахвам, ако са по-малки от нула
        numList.removeIf(n -> n < 0);
        // Обръщам реда им
        Collections.reverse(numList);

        // Ако списъка не е празен го принтирам
        if (numList.isEmpty()) {

            System.out.println("empty");

        } else {

            System.out.print(numList.toString().replaceAll("[\\[\\],]", ""));

        }

    }

}
