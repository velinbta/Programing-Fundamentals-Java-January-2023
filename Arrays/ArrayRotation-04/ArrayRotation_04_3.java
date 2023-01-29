package Arrays;

import java.util.Scanner;

public class ArrayRotation_04_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numberOfRotations = Integer.parseInt(scanner.nextLine());

        StringBuilder finalText = new StringBuilder(input);

        for (int i = 0; i < numberOfRotations; i++) {
            // Взимам индекса със следващото празно място
            int nextSpaceIndex = finalText.indexOf(" ");

            // Правя си String, от началото до следващото празно място
            String sub = finalText.substring(0, nextSpaceIndex);

            // Слагам го накрая на текста
            finalText.append(" ").append(sub);

            // Премахвам от началото до следващото празно място
            finalText.replace(0, nextSpaceIndex + 1, "");

        }

        System.out.println(finalText);

    }

}
