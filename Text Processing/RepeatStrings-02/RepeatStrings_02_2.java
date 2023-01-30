package TextProcessing;

import java.util.Scanner;

public class RepeatStrings_02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        // Ще добавя повторените елементи от масива в StringBuilder
        StringBuilder repeatBuilder = new StringBuilder();

        // Обхождам дължината на масива, след това дължината на всяка дума от масива
        for (int i = 0; i < inputArr.length; i++) {

            String currentWord = inputArr[i];
            int currentWordLength = currentWord.length();

            // Повтарям думата, според дължината й
            for (int j = 0; j < currentWordLength; j++) {

                repeatBuilder.append(currentWord);

            }

        }

        System.out.println(repeatBuilder);

    }

}
