package MethodsExercises;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        // Докато комантада не е "END"
        while (!command.equals("END")) {

            // Първоначалното число
            String initialIntegerAsString = command;

            // Методът обръща числото
            String reversed = getStringReversed(initialIntegerAsString);

            // Връща ми булев резултат, дали са еднакви или не
            boolean isEqual = isEqualOrNot(initialIntegerAsString, reversed);

            System.out.println(isEqual);

            command = scanner.nextLine();

        }


    }

    public static String getStringReversed(String initialIntegerAsString) {
        // Обръщам числото наобратно със StringBuilder
        StringBuilder reversed = new StringBuilder(initialIntegerAsString);

        return reversed.reverse().toString();

    }

    public static boolean isEqualOrNot(String initialIntegerAsString, String reversed) {
        // Проверявам дали са еднакви
        return initialIntegerAsString.equals(reversed);

    }

}
