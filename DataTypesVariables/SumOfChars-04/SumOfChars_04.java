package DataTypesVariables;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sumTotal = 0; // <- Общата сума на ASCII стойностите
        for (int i = 0; i < lines; i++) {

            char symbol = scanner.nextLine().charAt(0); // <- Прочитам char, "lines" на брой пъти

            sumTotal += symbol; // <- сумирам

        }

        System.out.printf("The sum equals: %d%n", sumTotal);

    }

}
