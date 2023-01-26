package Methods;

import java.util.Scanner;

public class MultiplicationSign_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам три числа
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        // Добавям ги в масив, защото ще ми трябва да проверя колко от тях са по-малки от 0
        int[] numArr = new int[]{firstNumber, secondNumber, thirdNumber};

        System.out.println(findTheMultiplicationSignWithoutMultiplyingThreeIntegers(numArr));

    }

    private static String findTheMultiplicationSignWithoutMultiplyingThreeIntegers(int[] numArr) {

        int positiveCount = 0;
        // Обхождам масива и намирам, колко числа са по-малки от 0
        // Ако има 0, директно ми връща "zero" (при наличие на една 0 - резултата е 0)
        for (int current : numArr) {

            if (current == 0) {
                return "zero";
            }

            if (current < 0) {
                positiveCount++;
            }

        }

        // Ако са 2 или пък са 0 - резултата от умножението ще е положителен
        // Във всички други случай (при три числа) - отрицателен
        if (positiveCount == 2 || positiveCount == 0) {

            return "positive";

        } else {

            return "negative";

        }

    }

}