package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MultiplicationSign_05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам три числа
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        // Добавям ги в списък, защото ще ми трябва да проверя колко от тях са по-малки от 0
        List<Integer> numList = new ArrayList<>(Arrays.asList(firstNumber, secondNumber, thirdNumber));

        System.out.println(findTheMultiplicationSignWithoutMultiplyingThreeIntegers(numList));

    }

    private static String findTheMultiplicationSignWithoutMultiplyingThreeIntegers(List<Integer> numList) {
        // Ако в списъка се съдържа 0, резултата при умножението ще е 0 !
        // Като започна така, варианта да има 0 в проверките по-надолу не съществува
        if (numList.contains(0)) {
            return "zero";
        }

        int positiveCount = 0;
        // Обхождам списъка и намирам колко от числата са по-малки от 0
        for (int current : numList) {

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