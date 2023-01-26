package Methods;

import java.util.Scanner;

public class Calculation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ("add", "multiply", "subtract", "divide")
        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        // В зависимост от командата:
        switch (command) {
            case "add":
                // Събирам
                addAndPrintTwoNumbers(firstNum, secondNum);
                break;
            case "multiply":
                // Умножавам
                multiplyAndPrintTwoNumbers(firstNum, secondNum);
                break;
            case "subtract":
                // Изваждам
                subtractAndPrintTwoNumbers(firstNum, secondNum);
                break;
            case "divide":
                // Деля
                divideAndPrintTwoNumbers(firstNum, secondNum);
                break;

        }

    }

    public static void addAndPrintTwoNumbers(int first, int second) {

        int result = first + second;
        System.out.println(result);

    }

    public static void multiplyAndPrintTwoNumbers(int first, int second) {

        int result = first * second;
        System.out.println(result);

    }


    public static void subtractAndPrintTwoNumbers(int first, int second) {

        int result = first - second;
        System.out.println(result);

    }

    public static void divideAndPrintTwoNumbers(int first, int second) {

        int result = first / second;
        System.out.println(result);

    }


}
