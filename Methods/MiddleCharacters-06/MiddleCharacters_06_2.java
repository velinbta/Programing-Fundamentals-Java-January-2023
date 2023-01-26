package Methods;

import java.util.Scanner;

public class MiddleCharacters_06_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам текста, като масив от символи
        char[] chArr = scanner.nextLine().toCharArray();

        // Методът намира “средната или средните" букви
        printMiddleChars(chArr);

    }

    private static void printMiddleChars(char[] findMiddleChars) {
        // От тук ще взема позицията на символа
        // или символите в зависимост дали са четни или не
        int middle = findMiddleChars.length / 2;

        // Проверявам дали е четен брой
        if (findMiddleChars.length % 2 == 0) {
            // Ако е четен взимам символа преди средния и средния
            System.out.println(findMiddleChars[middle - 1] + "" + findMiddleChars[middle]);

        } else {
            // Ако е нечетен - взимам средния
            System.out.println(findMiddleChars[middle]);

        }

    }

}
