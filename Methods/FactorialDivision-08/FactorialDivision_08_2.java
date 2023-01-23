package MethodsExercises;

import java.util.Scanner;

public class FactorialDivision_08_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        // Един и същ метод отговаря за идчислението на първия и втория факториел
        // Използвам long, защото може да съществува по-дълъг факториел
        long firstFactorial = factorialCalculation(first);
        long secondFactorial = factorialCalculation(second);
        // Деля резултата и го форматирам
        double result = (firstFactorial * 1.0) / secondFactorial;

        System.out.printf("%.2f", result);

    }

    public static long factorialCalculation(long n) {

        // Изчислявам факториела:
        long result = 1;

        for (long i = 1; i <= n; i++) {

            result = result * i;

        }

        return result;

    }


}
