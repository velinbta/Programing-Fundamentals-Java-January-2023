package TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther_05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // Ще съхранявам на различни места цифри, букви и други
        StringBuilder digitsBuild = new StringBuilder();
        StringBuilder lettersBuild = new StringBuilder();
        StringBuilder otherBuild = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            // Текущият символ от итерацията
            char currentChar = text.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Добавям цифри
                digitsBuild.append(currentChar);

            } else if (Character.isLetter(currentChar)) {
                // Добавям букви
                lettersBuild.append(currentChar);

            } else {
                // Добавям други
                otherBuild.append(currentChar);

            }

        }

        System.out.printf("%s\n%s\n%s\n", digitsBuild, lettersBuild, otherBuild);

    }

}
