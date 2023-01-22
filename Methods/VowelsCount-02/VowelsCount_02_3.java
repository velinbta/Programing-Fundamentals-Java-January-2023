package MethodsExercises;

import java.util.Scanner;

public class VowelsCount_02_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам масив от char, и го правя с малки бувкви за да ми е по-лесно да намеря гласните
        // Вместо 10 - ще проверявам само 5
        char[] text = scanner.nextLine().toLowerCase().toCharArray();
        // Метод, който ги брой и принтира броя им
        printCountOfVowelsInText(text);

    }

    private static void printCountOfVowelsInText(char[] text) {

        int count = 0;

        for (char symbol : text) {

            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {

                count++;

            }

        }

        System.out.println(count);

    }
}
