package TextProcessing;

import java.util.Scanner;

public class ValidUsernames_01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernamesArr = scanner.nextLine().split(", ");

        // Обхождам масива с потребителите
        for (int i = 0; i < usernamesArr.length; i++) {

            String currentUsername = usernamesArr[i];
            // Методите ми проверяват дали са от 3 до 16 символа и дали са само от позволените такива
            if (verifyIf3To16DigitsLong(currentUsername) && containsOnlyLettersNumbersHyphensAndUnderscores(currentUsername)) {

                System.out.println(currentUsername);

            }

        }

    }

    private static boolean verifyIf3To16DigitsLong(String username) {
        // от 3 до 16 символа включително
        return username.length() >= 3 && username.length() <= 16;

    }

    private static boolean containsOnlyLettersNumbersHyphensAndUnderscores(String username) {

        for (int i = 0; i < username.length(); i++) {
            char currentChar = username.charAt(i);

            // Ако символът е различен от буква, цифра, тире или долна черта връща false
            if (!Character.isLetter(currentChar) && !Character.isDigit(currentChar)
                    && currentChar != '-' && currentChar != '_') {

                return false;

            }

        }

        return true;

    }

}
