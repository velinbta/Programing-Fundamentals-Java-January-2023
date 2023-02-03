package DataTypesVariables;

import java.util.Scanner;

public class CharsToString_06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам 3 char променливи и ги конкатенирам
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        // Трябва да има "" отначало, иначе ще се съберат числови стойности
        String product = "" + first + second + third;
        System.out.println(product);

    }

}
