package DataTypesVariables;

import java.util.Scanner;

public class ReversedChars_07_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам 3 char променливи и ги принтирам в обратен ред
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        String product = String.format("%c %c %c", third, second, first);

        System.out.println(product);

    }

}
