package MethodsLab;

import java.util.Scanner;

public class MathOperations_11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получавам първо и второ число и оператор
        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();   //    / * + -
        double secondNumber = Double.parseDouble(scanner.nextLine());

        // Търся според оператора
        switch (operator) {

            // Използвам метод, според който ми събира, изважда, умножава или дели
            case "/":
                System.out.printf("%.0f%n" , getResultByDividing(firstNumber, secondNumber));
                break;
            case "*":
                System.out.printf("%.0f%n" , getResultByMultiplying(firstNumber, secondNumber));
                break;
            case "+":
                System.out.printf("%.0f%n" , getResultByAdding(firstNumber, secondNumber));
                break;
            case "-":
                System.out.printf("%.0f%n" , getResultBySubtracting(firstNumber, secondNumber));
                break;

        }

    }
    // Метод, който ги събира
    public static double getResultByAdding(double first, double second) {

        return first + second;

    }
    // Метод, който ги изважда
    public static double getResultBySubtracting(double first, double second) {

        return first - second;

    }
    // Метод, който ги умножава
    public static double getResultByMultiplying(double first, double second) {

        return first * second;

    }
    // Метод, който ги дели
    public static double getResultByDividing(double first, double second) {

        return first / second;

    }

}







