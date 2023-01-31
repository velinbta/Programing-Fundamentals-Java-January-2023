package BasicSyntax;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oddNumbersToPrint = Integer.parseInt(scanner.nextLine()); //  <- Колко нечетни числа да се принтират
        int iterations = oddNumbersToPrint * 2; // Брой итерации

        int sumOdd = 0; // Сумата на нечетните числа
        for (int i = 1; i <= iterations; i++) {

            if (i % 2 != 0) {

                sumOdd += i;
                System.out.println(i);

            }

        }

        System.out.printf("Sum: %d", sumOdd);

    }

}
