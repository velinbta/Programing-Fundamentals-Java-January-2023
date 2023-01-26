package Methods;

import java.util.Scanner;

public class MultiplyEvenByOdds_10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integerNumber = Integer.parseInt(scanner.nextLine());

        // Това е съвкупност от 3 метода:
        int result = getMultipleOfEvenAndOddDigits(integerNumber);
        System.out.println(result);

    }

    public static int getEvenDigitSum(int integerNumber) {
        // Държа сумата на четните числа
        int evenSum = 0;

        integerNumber = Math.abs(integerNumber); // По абсолютна стойност

        while (integerNumber > 0) {
            // Взимам последното число
            int digit = integerNumber % 10;
            // Ако е четно го прибавям към общата сума
            if (digit % 2 == 0) {

                evenSum = evenSum + digit;

            }
            // Махам последното число
            integerNumber = integerNumber / 10;

        }


        return evenSum;

    }

    public static int getOddDigitsSum(int integerNumber) {
        // Държа сумата на нечетните числа
        int oddSum = 0;

        integerNumber = Math.abs(integerNumber); // По абсолютна стойност

        while (integerNumber > 0) {
            // Взимам последното число
            int digit = integerNumber % 10;
            // Ако е нечетно го прибавям към общата сума
            if (digit % 2 != 0) {

                oddSum = oddSum + digit;

            }

            // Махам последното число
            integerNumber = integerNumber / 10;
        }


        return oddSum;
    }

    public static int getMultipleOfEvenAndOddDigits(int integerNumber) {
        // Умножава получената сума на четни и нечетни от предходните методи
        int oddSum = getOddDigitsSum(integerNumber);
        int evenSum = getEvenDigitSum(integerNumber);

        return oddSum * evenSum;

    }

}
