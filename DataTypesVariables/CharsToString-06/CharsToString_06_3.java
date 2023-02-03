package DataTypesVariables;

import java.util.Scanner;

public class CharsToString_06_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам 3 char променливи и ги съединявам, чрез String.format
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        String product = String.format("%c%c%c", first, second, third);
        System.out.println(product);

    }

}
