package MethodsLab;

import java.util.Scanner;

public class MathOperations_11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получавам първото и второто число и оператор
        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());

        // Използвам метод, който според оператора ми изчислява резултата
        double result = getResultByGivenOperator(firstNumber, operator, secondNumber);
        System.out.printf("%.0f\n", result);

    }

    public static double getResultByGivenOperator(double firstNumber, String operator, double secondNumber) {
        // Тук държа резултата
        double result = 0.0;
        // Търся според оператора
        switch (operator) {

            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;

        }

        return result;

    }
}
