package DataTypesVariables;

import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToTheRight_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {

            // Правя масив и взимам двете числа по отделно
            long[] numArr = Arrays.stream(scanner.nextLine().split("\\s"))
                    .mapToLong(e -> Long.parseLong(e)).toArray();

            long firstNumber = numArr[0];
            long secondNumber = numArr[1];

            // Ако не се използва Math.abs() - при намирането на сбора на цифрите,
            // ще даде отрицателен резултат!
            if (firstNumber >= secondNumber) {

                // Методът намира сумата на цифрите на числото
                int sumDigitsFirst = getSumOfDigits(firstNumber);
                System.out.println(sumDigitsFirst);

            } else {

                // Методът намира сумата на цифрите на числото
                int sumDigitsSecond = getSumOfDigits(secondNumber);
                System.out.println(sumDigitsSecond);

            }

        }

    }

    private static int getSumOfDigits(long number) {

        int sum = 0;

        while (number != 0) {

            int digit = (int) (number % 10); // <- Взимам последната цифра

            sum += digit;

            number /= 10; // <- Махам последната цифра

        }

        return Math.abs(sum); // <- Без Math.abs() ще даде отрицателен резултат

    }

}
