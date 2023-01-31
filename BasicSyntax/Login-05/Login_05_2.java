package BasicSyntax;

import java.util.Scanner;

public class Login_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        // Получавам потребителско име и го обръщам отзад напред
        // Използвам вариант с масив, който обръща елементите
        String[] usernameElements = username.split("");

        // Така средният елемент, ако дължината е нечетна, остава непроменен
        int lengthArr = usernameElements.length / 2;
        for (int i = 0; i < lengthArr; i++) {

            String currentIndex = usernameElements[i]; // <- Взимам елемента да не се изгуби

            // Почвам да ги обръщам, като всеки път ходя и с един елемент назад
            usernameElements[i] = usernameElements[usernameElements.length - 1 - i];
            usernameElements[usernameElements.length - 1 - i] = currentIndex;

        }

        // Правилната парола е обърнатото потребителско име
        String correctPassword = String.join("", usernameElements);

        String loginTry = scanner.nextLine();

        int tryCount = 0;
        boolean isCorrect = true;
        // Докато е различна от правилната парола
        while (!loginTry.equals(correctPassword)) {

            tryCount++;

            if (tryCount == 4) { // <- Ако опитите станат 4, потребителя се блокира

                System.out.printf("User %s blocked!", username);
                isCorrect = false;
                break;

            } else {

                System.out.println("Incorrect password. Try again.");

            }

            loginTry = scanner.nextLine();

        }

        if (isCorrect) {
            // Ако си познае паролата
            System.out.printf("User %s logged in.", username);

        }

    }

}
