package Methods;

import java.util.Scanner;

public class RepeatString_07_StringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам текст и брой на повтарянията
        String input = scanner.nextLine();
        int repetitionsCount = Integer.parseInt(scanner.nextLine());

        // Методът конкатенира текста, брой задедени пъти
        String concatenatedInput = getInputConcatenatedRepetitionsCountTimes(input, repetitionsCount);

        System.out.println(concatenatedInput);

    }

    private static String getInputConcatenatedRepetitionsCountTimes(String input, int repetitionsCount) {

        StringBuilder join = new StringBuilder();

        for (int i = 1; i <= repetitionsCount; i++) {

            join.append(input);

        }

        return join.toString();

    }

}
