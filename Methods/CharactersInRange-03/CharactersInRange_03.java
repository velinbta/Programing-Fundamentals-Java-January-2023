package MethodsExercises;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам два символа, един е началото, другият е края
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        // Методът ми принтира символите между първия и втория, или между втория и първия
        printCharactersInBetweenTwoGivenCharacters(first, second);


    }

    public static void printCharactersInBetweenTwoGivenCharacters(char a, char b) {

        // Ако първият е по-голям, започвам от него
        if (a < b) {

            for (char i = (char) (a + 1); i < b; i++) {

                System.out.print(i + " ");

            }

            // Ако вторият е по-голям, започвам от него
        } else {

            for (char i = (char) (b + 1); i < a; i++) {

                System.out.print(i + " ");

            }

        }

    }


}
