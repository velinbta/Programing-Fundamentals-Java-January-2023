package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable20_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine()); // <- Умножител

        if (multiplier <= 10) {

            for (int i = multiplier; i <= 10; i++) { // <- До 10

                int result = number * i; // Числото по номера на итерацията

                String product = String.format("%d X %d = %d", number, i, result);
                System.out.println(product);

            }

        } else {

            // Ако е по-малко от 10
            int result = number * multiplier;
            String product = String.format("%d X %d = %d", number, multiplier, result);
            System.out.println(product);

        }

    }

}
