package BasicSyntax;

import java.util.Scanner;

public class Login_05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        // Обръщам потребителското име и получавам паролата
        String correctPassword = new StringBuilder(username).reverse().toString();

        String inputTry = scanner.nextLine();

        boolean isCorrect = true;
        int countEntry = 0;
        // Докато е различна от правилната парола
        while (!inputTry.equals(correctPassword)) {

            countEntry++;

            if (countEntry != 4) {
                // До 4 опита
                System.out.println("Incorrect password. Try again.");

            } else {
                // Ако е 4ти опит, не е познал паролата - прекратявам цикъла
                System.out.printf("User %s blocked!%n", username);
                isCorrect = false;
                break;

            }

            inputTry = scanner.nextLine();

        }

        if (isCorrect) {
            // Ако е правилна паролата
            System.out.printf("User %s logged in.%n", username);

        }

    }

}
