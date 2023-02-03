package DataTypesVariables;

import java.util.Scanner;

public class ConcatNames_05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам 3 String променливи и ги конкатенирам
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String product = firstName.concat(delimiter).concat(lastName);

        System.out.println(product);

    }

}
