package Methods;

import java.util.Scanner;

public class MultiplicationSign_05_3 {
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

        int count = 0;
        // Ако има 0, директно ми връща "zero" (при наличие на една 0 - резултата е 0)
        for (int current : numArr) {

            if (current == 0) {
                return "zero";
            }

            if (current < 0) {
                count++;
            }

        }

        // Ако броя на числата под нула е четен,
        // резултата е "positive" - нечетен е "negative"
        if (count % 2 == 0) {

            return "positive";

        } else {

            return "negative";

        }

    }

}



