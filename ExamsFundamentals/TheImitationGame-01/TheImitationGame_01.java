package ExamsFundamentals;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {

            String[] infoArr = input.split("\\|");
            String command = infoArr[0];

            switch (command) {
                case "Move":

                    int numberOfLetters = Integer.parseInt(infoArr[1]);

                    // Ако са равни с дължината губи смисъл, ще остане същия текст
                    if (numberOfLetters >= 0 && numberOfLetters < message.length()) {

                        String substring = message.substring(0, numberOfLetters); // <- Подтекст
                        // Изтривам отначалото до зададената дължина и добавям подтекста накрая
                        message = new StringBuilder(message)
                                .delete(0, numberOfLetters).append(substring).toString();

                    }

                    break;
                case "Insert":

                    int index = Integer.parseInt(infoArr[1]);
                    String value = infoArr[2];

                    if (index >= 0 && index <= message.length()) {
                        // Добавям на дадения индекс - стойността
                        message = new StringBuilder(message).insert(index, value).toString();

                    }

                    break;
                case "ChangeAll":
                    // Заменям всички срещания на дадения литерал
                    String substringToChange = infoArr[1];
                    String replacement = infoArr[2];

                    message = message.replace(substringToChange, replacement);

                    break;

            }

            input = scanner.nextLine();

        }

        System.out.printf("The decrypted message is: %s\n", message);

    }

}
