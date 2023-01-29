package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам масив от числа от конзолата
        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        // Итерирам по дължината
        for (int i = 0; i < numArr.length; i++) {

            boolean isTop = true; // Ако от дясно няма по-голямо число

            // Итерирам от последния елемент до i - но не включвам i
            // Понеже не включвам последния елемент, той винаги си излиза Top
            for (int j = numArr.length - 1; j > i; j--) {

                int firstElement = numArr[i];
                int secondElement = numArr[j];

                if (firstElement <= secondElement) {
                    // Ако i e по-малко или равно на j - не е Top Integer
                    isTop = false;
                    break;

                }

            }

            if (isTop) {

                System.out.print(numArr[i] + " ");

            }

        }

    }

}
