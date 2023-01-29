package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TopIntegers_05_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        // Обхождам елементите до предпоследния
        for (int i = 0; i < intList.size() - 1; i++) {

            int firstElement = intList.get(i);
            int secondElement = intList.get(i + 1);

            // Ако първия е по-малък или равен на втория,
            // го премахвам и връщам с една итерация
            if (firstElement <= secondElement) {

                intList.remove(i);
                i = -1;

            }

        }

        System.out.println(intList.toString().replaceAll("[\\[\\],]", ""));

    }

}
