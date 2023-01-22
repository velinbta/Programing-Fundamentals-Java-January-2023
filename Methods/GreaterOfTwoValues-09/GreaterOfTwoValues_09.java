package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues_09_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получавам типа на данните
        String type = scanner.nextLine();
        // Тярся по него и чета, според типа
        switch (type) {
            // Внимание се обръща на подходящия метод за променливите:
            case "int":
                int firstInt = Integer.parseInt(scanner.nextLine());
                int secondInt = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstInt, secondInt));

                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));

                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString, secondString));

                break;

        }


    }
    // Използвам овърлоудване на метода:
    public static int getMax(int first, int second) {
        // Еквивалентно на Math.max
        if (first > second) {

            return first;

        } else {

            return second;

        }

    }

    public static char getMax(char first, char second) {
        // Като Math.max, само че сравнява char
        if (first > second) {

            return first;

        } else {

            return second;

        }


    }

    public static String getMax(String first, String second) {
        // Метод, който сравнява String променлива
        // Връща -1 ако сравняваме първия String с втория,
        // 0 ако са равни и 1 ако втория е по-голям от първия
        // За да го използваме като boolean трябва да му дадем първоначално с какво да сравнява ">= 0"
        if (first.compareTo(second) >= 0) {

            return first;

        } else {

            return second;

        }

    }

}
