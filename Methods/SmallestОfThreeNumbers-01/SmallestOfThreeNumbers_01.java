package MethodsExercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам 3 числа
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        // Правя метод, който да ми намира най-малкото сред трите числа
        printSmallestOfThreeNumbers(first, second, third);

    }

    private static void printSmallestOfThreeNumbers(int first, int second, int third) {

        if (first <= second && first <= third) {

            System.out.println(first);

        } else if (second <= first && second <= third) {

            System.out.println(second);

        } else {

            System.out.println(third);

        }


    }

}
