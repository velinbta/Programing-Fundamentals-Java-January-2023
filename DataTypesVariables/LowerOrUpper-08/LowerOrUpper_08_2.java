package DataTypesVariables;

import java.util.Scanner;

public class LowerOrUpper_08_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        if (symbol >= 'A' && symbol <= 'Z') { // <- Ако е с главна буква

            System.out.println("upper-case");

        } else if (symbol >= 'a' && symbol <= 'z') { // <- Ако е с малка буква

            System.out.println("lower-case");

        }

    }

}
