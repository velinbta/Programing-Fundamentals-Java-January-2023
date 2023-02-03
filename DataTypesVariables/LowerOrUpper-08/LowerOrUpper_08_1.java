package DataTypesVariables;

import java.util.Scanner;

public class LowerOrUpper_08_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(symbol)) { // <- Ако е с главна буква

            System.out.println("upper-case");

        } else if (Character.isLowerCase(symbol)) { // <- Ако е с малка буква

            System.out.println("lower-case");

        }

    }

}
