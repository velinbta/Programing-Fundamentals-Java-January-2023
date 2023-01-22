package MethodsExercises;

import java.util.Scanner;

public class PasswordValidator_04_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам паролата като масив от символи
        char[] password = scanner.nextLine().toCharArray();

        // Трите ми метода връщат булев резултат, за да е валидна паролата и трите трябва да са true
        if (is6to10Characters(password) && isOnlyLettersOrDigits(password) && isAtLeast2DigitsLong(password)) {

            System.out.println("Password is valid");

        } else {

            // В противен случай, правя проверка, за false, за всеки от методите отделно:
            if (!is6to10Characters(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }

            if (!isOnlyLettersOrDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }

            if (!isAtLeast2DigitsLong(password)) {
                System.out.println("Password must have at least 2 digits");
            }

        }

    }

    private static boolean is6to10Characters(char[] password) {
        //•	6 – 10 characters (inclusive);
        // От 6 до 10 символа включително
        return password.length >= 6 && password.length <= 10;

    }

    private static boolean isOnlyLettersOrDigits(char[] password) {

        //•	Consists only of letters and digits;
        // Да съдържа само букви и цифри
        for (char symbol : password) {

            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }

        }

        return true;
    }

    private static boolean isAtLeast2DigitsLong(char[] password) {

        //•	Have at least 2 digits
        // Да има поне 2 цифри
        int digitsCount = 0;

        for (char symbol : password) {

            if (Character.isDigit(symbol)) {
                digitsCount++;
            }

        }

        return digitsCount >= 2;
    }
}
