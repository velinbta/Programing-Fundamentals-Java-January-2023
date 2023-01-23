package MethodsExercises;

import java.util.Scanner;

public class TopNumber_10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        // Може и да се започне от 1, просто
        // над 16 са първите числа отговарящи на условията
        for (int i = 16; i <= n; i++) {
            // Ако и двете условия са вярни принтирам числото
            if (isSumOfDigitsDivisibleBy8(i) && hasAtLeastOneOddDigit(i)) {

                System.out.println(i);

            }

        }

    }

    private static boolean isSumOfDigitsDivisibleBy8(int n) {
        // Пресмятам сумата на отделните цифри
        int sum = 0;

        while (n > 0) {
            // Взимам последната цифра
            int digit = n % 10;

            sum += digit;
            // Махам последната цифра
            n = n / 10;

        }
        // Връщам дали се дели на 8 - булев резултат
        return sum % 8 == 0;

    }

    private static boolean hasAtLeastOneOddDigit(int n) {

        while (n > 0) {
            // Взимам последната цифра
            int digit = n % 10;

            if (digit % 2 != 0) {
                // Ако съдържа поне 1 нечетна цифра - връща true
                return true;

            }
            // Махам последната цифра
            n = n / 10;
        }

        // Иначе връща false
        return false;
    }


}
