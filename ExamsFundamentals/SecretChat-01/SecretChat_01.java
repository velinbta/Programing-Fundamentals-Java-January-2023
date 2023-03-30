package ExamsFundamentals;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {

            String[] infoArr = input.split(":\\|:");
            String command = infoArr[0];

            switch (command) {

                case "InsertSpace":

                    int index = Integer.parseInt(infoArr[1]);

                    if (index >= 0 && index <= message.length()) { // <- Ако е валиден

                        // На дадения индекс, слагам едно празно място
                        message = new StringBuilder(message).insert(index, " ").toString();

                    }

                    System.out.println(message);

                    break;

                case "Reverse":

                    String substringForReverse = infoArr[1];

                    if (message.contains(substringForReverse)) { // <- Ако се съдържа в съобщението

                        int substringLength = substringForReverse.length(); // <- Дължина на подтекста
                        int beginning = message.indexOf(substringForReverse); // <- Начален индекс

                        message = new StringBuilder(message) // <- Изтривам подтекста от съобщението
                                .delete(beginning, beginning + substringLength).toString();

                        String reversed = new StringBuilder(substringForReverse).reverse().toString();

                        message = message.concat(reversed); // <- Конкатенирам обърнатия подтекст

                        System.out.println(message);

                    } else {

                        System.out.println("error");

                    }

                    break;

                case "ChangeAll":

                    String substringForChange = infoArr[1];
                    String replacement = infoArr[2];

                    // Заменям всички срещания на подтекста, ако има такива
                    message = message.replace(substringForChange, replacement);
                    System.out.println(message);

                    break;

            }

            input = scanner.nextLine();

        }

        System.out.printf("You have a new text message: %s\n", message);

    }

}
