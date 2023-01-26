package Methods;

import java.util.Scanner;

public class FactorialDivision_08_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        // Един и същ метод отговаря за идчислението на първия и втория факториел
        double firstFactorial = factorialCalculation(first);
        double secondFactorial = factorialCalculation(second);
        // Деля резултата и го форматирам
        double result = firstFactorial / secondFactorial;

        System.out.printf("%.2f", result);

    }

    public static double factorialCalculation(int n) {

        // Изчислявам факториела:
        double result = 1.0;

        for (int i = 1; i <= n; i++) {

            result = result * i;

        }

        return result;

    }

}
