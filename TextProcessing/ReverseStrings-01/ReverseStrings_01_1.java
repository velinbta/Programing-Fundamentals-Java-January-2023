package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            // Методът ми връща input отзад напред
            String reversed = getStringReversed(input);

            System.out.printf("%s = %s%n", input, reversed);

            input = scanner.nextLine();

        }

    }

    private static String getStringReversed(String input) {

        String reversed = "";

        // Прочитам отзад напред текста и конкатенирам всеки символ
        for (int i = input.length() - 1; i >= 0; i--) {

            reversed += input.charAt(i);

        }

        return reversed;

    }

}
