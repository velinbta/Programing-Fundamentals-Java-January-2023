package ExamsFundamentals;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {

            String[] infoArr = input.split(">>>");
            String command = infoArr[0];

            switch (command) { // <- Търся по командата

                case "Contains": {

                    String substring = infoArr[1];

                    if (activationKey.contains(substring)) { // <- Ако съдържа подтекста

                        System.out.printf("%s contains %s\n", activationKey, substring);

                    } else { // <- Ако не го съдържа

                        System.out.println("Substring not found!");

                    }

                    break;

                } case "Flip": {

                    String state = infoArr[1]; // <- Големи или малки букви
                    int startIndex = Integer.parseInt(infoArr[2]);
                    int endIndex = Integer.parseInt(infoArr[3]);

                    boolean isValid = startIndex >= 0 && startIndex < endIndex
                            && endIndex <= activationKey.length();

                    if (isValid) { // <- Ако и двата индекса са валидни

                        String substring = activationKey.substring(startIndex, endIndex);

                        switch (state) {

                            case "Upper": // <- Уголемявам буквите и слагам подтекста обратно

                                activationKey = new StringBuilder(activationKey)
                                        .replace(startIndex, endIndex, substring.toUpperCase()).toString();

                                break;

                            case "Lower": // <- Правя буквите малки и слагам подтекста обратно

                                activationKey = new StringBuilder(activationKey)
                                        .replace(startIndex, endIndex, substring.toLowerCase()).toString();

                                break;

                        }

                    }

                    System.out.println(activationKey);
                    break;

                } case "Slice": {

                    int startIndex = Integer.parseInt(infoArr[1]);
                    int endIndex = Integer.parseInt(infoArr[2]);

                    boolean isValid = startIndex >= 0 && startIndex <= activationKey.length()
                            && startIndex < endIndex;

                    if (isValid) { // <- Ако са валидни и двата индекса

                        // Да се има предвид, че при .delete на StringBuilder, крайния индекс
                        // може да е много по-голям, за което не се хвърля изключение
                        activationKey = new StringBuilder(activationKey) // <- Трия буквите от начален до краен индекс
                                .delete(startIndex, endIndex).toString();

                    }

                    System.out.println(activationKey);

                    break;

                }

            }

            input = scanner.nextLine();

        }

        System.out.printf("Your activation key is: %s\n", activationKey);

    }

}
