package Methods;

import java.util.Scanner;

public class MiddleCharacters_06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Методът намира “средната или средните" букви
        printMiddleCharacters(input);

    }

    public static void printMiddleCharacters (String input) {
        // От тук ще взема позицията на символа
        // или символите в зависимост дали са четни или не
        int middle = input.length() / 2;

        // Проверявам дали е четен брой
        if (input.length() % 2 == 0) {

            System.out.print (input.charAt(middle - 1) + "" + input.charAt(middle));

        } else {

            System.out.print (input.charAt(middle));

        }

    }

}