package MethodsLab;

import java.util.Scanner;

public class RepeatString_07_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repetitionsCount = Integer.parseInt(scanner.nextLine());

        // Методът конкатенира текста, брой задедени пъти
        String concatInput = getInputConcatenatedRepetitionsCountTimes(input, repetitionsCount);

        System.out.println(concatInput);

    }

    private static String getInputConcatenatedRepetitionsCountTimes(String input, int repetitionsCount) {

        String join = "";

        for (int i = 0; i < repetitionsCount; i++) {

            join = join.concat(input);

        }

        return join;

    }

}
