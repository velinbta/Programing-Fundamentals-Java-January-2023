package TextProcessing;

import java.util.Scanner;

public class Substring_03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String input = scanner.nextLine();

        // Взимам индекса на това, което искам да премахна
        int indexToRemove = input.indexOf(toRemove);

        while (indexToRemove != -1) {

            input = input.replace(toRemove, "");
            // Докато индексът не стане - 1 -> тоест го няма
            indexToRemove = input.indexOf(toRemove);

        }

        System.out.println(input);

    }

}
