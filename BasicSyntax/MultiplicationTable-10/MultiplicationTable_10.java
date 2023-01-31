package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte number = Byte.parseByte(scanner.nextLine());

        for (int i = 1; i <= 10; i++) { // <- До 10

            int result = number * i; // Числото по номера на итерацията
            String product = String.format("%d X %d = %d", number, i, result);
            System.out.println(product);

        }

    }

}
