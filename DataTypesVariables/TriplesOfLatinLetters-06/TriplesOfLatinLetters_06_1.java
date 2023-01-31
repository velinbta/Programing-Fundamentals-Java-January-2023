package DataTypesVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters_06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // Три цикъла с char променливи, които се изпълняват до ASCII стойността на 'a + n'
        // и започват от 'a'
        for (char first = 'a'; first < 'a' + n; first++) {

            for (char second = 'a'; second < 'a' + n; second++) {

                for (char third = 'a'; third < 'a' + n; third++) {

                    String result = String.format("%c%c%c", first, second, third);
                    System.out.println(result);

                }

            }

        }

    }

}
