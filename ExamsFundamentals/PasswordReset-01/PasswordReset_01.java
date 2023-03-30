package ExamsFundamentals;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {

            String[] infoArr = input.split("\\s+");
            String command = infoArr[0];

            switch (command) {

                case "TakeOdd": // <- Конкатенира само нечетните символи и презаписва паролата

                    StringBuilder rawPassword = new StringBuilder();

                    for (int i = 1; i < password.length(); i += 2) { // <- Само нечетните

                        char currentSymbol = password.charAt(i);
                        rawPassword.append(currentSymbol);

                    }

                    password = rawPassword.toString();

                    System.out.println(password);

                    break;

                case "Cut": // <- Премахва от определен индекс до дадена дължина

                    int index = Integer.parseInt(infoArr[1]);
                    int length = Integer.parseInt(infoArr[2]);

                    if (index >= 0 && index + length <= password.length()) { // <- Ако е валиден индексът

                        // Махам подтекста от дадения индекс плюс дължината
                        password = new StringBuilder(password).delete(index, index + length).toString();

                    }

                    System.out.println(password);

                    break;

                case "Substitute": // <- Замества даден подтекст, ако той съществува в паролата

                    String substring = infoArr[1];
                    String substitute = infoArr[2];

                    if (password.contains(substring)) {

                        password = password.replace(substring, substitute);
                        System.out.println(password);

                    } else { // <- Ако не съществува

                        System.out.println("Nothing to replace!");

                    }

                    break;

            }

            input = scanner.nextLine();

        }

        System.out.printf("Your password is: %s\n", password);

    }

}
