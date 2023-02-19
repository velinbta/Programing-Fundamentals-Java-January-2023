package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine()); // <- Дължина на масива
        String command = scanner.nextLine();

        // Масив с зададена дължина, отначало празен
        int[] subsequenceArr = new int[length];

        int bestSample = 0; // <- Най-добрата крайна проба
        int leftMostPosition = 0; // <- Най-лявата позия, ако са повече
        int longestSubsequence = 0; // <- Най-дългата поредица от единици
        int totalSumOfArray = 0; // <- Сбор на числата в масива

        int bestSampleCounter = 0;
        boolean isEmpty = true; // <- Ако на първия вход не съм задал нищо

        while (!command.equals("Clone them!")) {
            bestSampleCounter++;

            int[] dnaArr = Arrays.stream(command.split("!+")) // <- Един или повече “!“
                    .mapToInt(e -> Integer.parseInt(e)).toArray();

            int currentSumOfArray = Arrays.stream(dnaArr).sum(); // <- Текуща сума числата в масива

            int onesCounter = 0;
            int currentStartingPositionOfSequence = -1;

            int currentLongestSubsequence = -1;
            int currentLeftMostPosition = 0;
            for (int i = 0; i < dnaArr.length; i++) {

                int currentNumber = dnaArr[i];

                if (currentNumber == 1) { // <- Поредицата започва само, ако числото е 1

                    onesCounter++; // Броя единиците

                    if (currentStartingPositionOfSequence == -1) {
                        currentStartingPositionOfSequence = i; // <- Задавам първоначална позиция на поредицата
                    }

                    if (currentLongestSubsequence < onesCounter) {
                        currentLongestSubsequence = onesCounter;
                        // За проверките после, най-лявата позиция
                        currentLeftMostPosition = currentStartingPositionOfSequence;
                    }

                } else { // <- Ако не е 1, поредицата се нулира

                    onesCounter = 0;
                    currentStartingPositionOfSequence = -1;

                }

            }

            if (longestSubsequence < currentLongestSubsequence) { // <- Ако най-дългата е по-малка от текущата

                // Задавам нови стойности на променливите
                bestSample = bestSampleCounter;
                totalSumOfArray = currentSumOfArray;
                longestSubsequence = currentLongestSubsequence;
                leftMostPosition = currentLeftMostPosition;
                subsequenceArr = dnaArr;
                isEmpty = false; // <- Значи съм намерил

            } else {

                if (longestSubsequence == currentLongestSubsequence) {  // Ако най-дългата е равна на текущата

                    if (currentLeftMostPosition < leftMostPosition) { // <- Задавам вече по индекс

                        bestSample = bestSampleCounter;
                        totalSumOfArray = currentSumOfArray;
                        leftMostPosition = currentLeftMostPosition;
                        subsequenceArr = dnaArr;
                        isEmpty = false; // <- Значи съм намерил

                    } else if (currentLeftMostPosition == leftMostPosition) { // <- Ако индексите са равни

                        if (currentSumOfArray > totalSumOfArray) { // <- Задавам по сума на елементи в масива

                            bestSample = bestSampleCounter;
                            totalSumOfArray = currentSumOfArray;
                            subsequenceArr = dnaArr;
                            isEmpty = false; // <- Значи съм намерил

                        }

                    }

                }

            }

            if (isEmpty) { // <- Значи не съм намерил и правя първата поредица най-добра

                isEmpty = false;
                bestSample = bestSampleCounter;
                totalSumOfArray = currentSumOfArray;
                subsequenceArr = dnaArr;

            }

            command = scanner.nextLine();

        }

        System.out.printf("Best DNA sample %d with sum: %d.\n", bestSample, totalSumOfArray);
        Arrays.stream(subsequenceArr).forEach(e -> System.out.print(e + " "));

    }

}
