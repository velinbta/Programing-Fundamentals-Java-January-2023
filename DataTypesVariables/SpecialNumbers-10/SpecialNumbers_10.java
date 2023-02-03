package DataTypesVariables;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // <- Числото, до което ще се проверява включително

        for (int i = 1; i <= n; i++) {  // <- От 1 до n

            int currentNumber = i; // <- Отделна променлива, за да не нулира цикъла всеки път

            int sumDigits = 0; // <- Сбора от цифрите

            while (currentNumber > 0) {

                int digit = currentNumber % 10; // <- Взимам последната цифра

                sumDigits += digit; // <- Събирам я

                currentNumber /= 10; // <- Махам последната цифра

            }

            // Ако сборът е 5, 7 или 11 е специално число
            boolean isSpecial = sumDigits == 5 || sumDigits == 7 || sumDigits == 11;

            if (isSpecial) {

                System.out.printf("%d -> True%n", i);

            } else {

                System.out.printf("%d -> False%n", i);

            }

        }

    }

}
