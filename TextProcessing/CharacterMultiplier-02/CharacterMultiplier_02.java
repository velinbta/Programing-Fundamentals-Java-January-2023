package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам входа като масив и отделям първия и втория текст
        String[] inputArr = scanner.nextLine().split("\\s+");
        String first = inputArr[0];
        String second = inputArr[1];

        // Намирам минимална и максимална дължина
        int minSize = Math.min(first.length(), second.length());
        int maxSize = Math.max(first.length(), second.length());

        int totalSum = 0;

        // Умножавам ASCII стойностите на символите на двата текста до по-късата дължина или ако са еднакви
        totalSum += getSumOfTwoStringCharactersMultipliedToTheMinSizedString(first, second, minSize);

        // Ако някой от текстовете е по-дълъг добавям остатъчните символи към сумата без да ги умножавам
        if (first.length() != second.length()) {

            if (first.length() < second.length()) {

                for (int i = minSize; i < maxSize; i++) {
                    totalSum += second.charAt(i);
                }

            } else {

                for (int i = minSize; i < maxSize; i++) {
                    totalSum += first.charAt(i);
                }

            }

        }

        System.out.println(totalSum);

    }

    private static int getSumOfTwoStringCharactersMultipliedToTheMinSizedString(String first, String second, int minSize) {

        int totalSum = 0;
        // Умножавам символа на първия по символа на втория текст
        for (int i = 0; i < minSize; i++) {

            int multiply = first.charAt(i) * second.charAt(i);
            totalSum += multiply;

        }

        return totalSum;
    }

}
