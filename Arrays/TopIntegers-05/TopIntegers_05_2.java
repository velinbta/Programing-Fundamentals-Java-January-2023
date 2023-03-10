package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам масив от числа от конзолата
        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        // В метод описвам, условията дали да принтира или не top Integer ->
        printIfLeftToRightIntegerHasNoGreaterInteger(numArr);

    }

    public static void printIfLeftToRightIntegerHasNoGreaterInteger(int[] numArr) {
        // Итерирам по дължината на масива
        for (int i = 0; i < numArr.length; i++) {
            // Ако няма по голямо число твърдение остава вярно и принтирам
            boolean hasNoBigger = true;

            // Започнам от където е стигнал i до предпоследния елемент, понеже взимам един повече в цикъла
            // Не влкючвам последния елемент и той си остава top
            for (int j = i; j < numArr.length - 1; j++) {

                int firstElement = numArr[i];
                int secondElement = numArr[j + 1];

                if (firstElement <= secondElement) {

                    hasNoBigger = false;
                    break;

                }

            }

            if (hasNoBigger) {

                System.out.print(numArr[i] + " ");

            }

        }

    }

}
