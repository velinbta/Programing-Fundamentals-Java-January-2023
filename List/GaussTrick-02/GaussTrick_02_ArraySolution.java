package List;

import java.util.Arrays;
import java.util.Scanner;

public class GaussTrick_02_ArraySolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
        int[] initialArr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int secondArrLength;
        // Размера на втория масив, който ще използвам зависи дали ще четен или нечетен,
        // броя на елементите в получения от конзолата масив
        if (initialArr.length % 2 == 0) {

            secondArrLength = initialArr.length / 2;

        } else {

            secondArrLength = initialArr.length / 2 + 1;

        }

        int[] secondArr = new int[secondArrLength];

        for (int i = 0; i < secondArrLength; i++) {

            if (initialArr.length % 2 != 0 && i == secondArrLength - 1) {
            // Ако е четен броя и последна итерация - презаписвам непроменен последния елемент
                secondArr[i] = initialArr[i];
                break;
            }

            int first = initialArr[i];
            int second = initialArr[initialArr.length - 1 - i];
            int product = first + second;

            // Сбор на първия и последен, като последния върви с едно назад, на всяка итерация
            secondArr[i] = product;

        }

        for (int i = 0; i < secondArr.length; i++) {

            System.out.print(secondArr[i] + " ");

        }

    }

}
