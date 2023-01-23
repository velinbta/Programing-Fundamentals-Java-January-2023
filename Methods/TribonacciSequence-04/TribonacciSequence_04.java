package MethodsMoreExercises;

import java.util.Scanner;

public class TribonacciSequence_04_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Дават ни 1 число, според което трябва да се удължи поредицата,
        // или пък да я оставим с 1 или 2 или 3 елемента
        int number = Integer.parseInt(scanner.nextLine());

        // От примерите става ясно, кой са първите 3 елемента от поредицата
        int first = 1;
        int second = 1;
        int third = 2;

        for (int i = 1; i <= number; i++) {

            // Ако i e по-малко от 3, методът принтира от вече ясните първи 3 числа
            if (i <= 3) {
                printSequenceAccordingToNumberGivenButUpToThree(i);
                continue;
            }

            // Получавам сумата и я добавям, ако i > 3
            int currentValue = first + second + third;

            System.out.print(currentValue + " ");

            // Презаписвам стойностите, за следващата итерация
            first = second;
            second = third;
            third = currentValue;

        }


    }

    private static void printSequenceAccordingToNumberGivenButUpToThree(int number) {

        if (number == 1) {

            System.out.printf("%d ", 1);

        } else if (number == 2) {

            System.out.printf("%d ", 1);

        } else if (number == 3) {

            System.out.printf("%d ", 2);

        }

    }


}
