package DataTypesVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 /*

        int kolkko = Integer.parseInt(scanner.nextLine());
        int obshto = 0;
        int takova = 0;
        boolean toe = false;
        for (int ch = 1; ch <= kolkko; ch++) {
            takova = ch;
            while (ch > 0) {
                obshto += ch % 10;
                ch = ch / 10;
            }
            toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
            System.out.printf("%d -> %b%n", takova, toe);
            obshto = 0;
            ch = takova;
        }

*/
        int n = Integer.parseInt(scanner.nextLine());  // <- Преименувам

        // Трия повечето променливи и правя, адекватни такива
        // Променям ги и ги измествам, като променям и принтирането
        for (int i = 1; i <= n; i++) {

            int currentNumber = i;  // <- Отделна променлива, за да не нулира цикъла всеки път

            int sum = 0; // <- Сбора от цифрите

            while (currentNumber > 0) {

                int digit = currentNumber % 10;  // <- Взимам последната цифра

                sum += digit; // <- Събирам я

                currentNumber = currentNumber / 10;  // <- Махам последната цифра

            }

            // Ако сборът е 5, 7 или 11 е специално число
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;

            if (isSpecial) {

                System.out.printf("%d -> True%n", i);

            } else {

                System.out.printf("%d -> False%n", i);

            }

        }

    }

}