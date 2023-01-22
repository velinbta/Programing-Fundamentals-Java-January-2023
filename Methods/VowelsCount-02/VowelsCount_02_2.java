package MethodsExercises;

import java.util.Scanner;

public class VowelsCount_02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Правя ги малки букви, за да може метода да търси само 5, а не 10 бувки - case insensitive
        String text = scanner.nextLine().toLowerCase();

        // Метода ги намира, преброява ги и принтира броя им
        printTheCountOfVowelsInText(text);

    }

    private static void printTheCountOfVowelsInText(String txt) {

        int count = 0;

        for (int i = 0; i < txt.length(); i++) {

            if (txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i' || txt.charAt(i) == 'o'
                    || txt.charAt(i) == 'u') {

                count++;
            }

        }

        System.out.println(count);
    }

}
