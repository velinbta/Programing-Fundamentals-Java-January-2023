package DataTypesVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters_06_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // Три цикъла с int променливи, които се изпълняват до n
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {
                    // Каствам int към char
                    char firstChar = (char) ('a' + i);
                    char secondChar = (char) ('a' + j);
                    char thirdChar = (char) ('a' + k);

                    // Правя резултата на String променлива и принтирам
                    String result = String.format("%c%c%c", firstChar, secondChar, thirdChar);
                    System.out.println(result);

                }

            }

        }

    }

}
