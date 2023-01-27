package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int totalCount = 0;
        int maxRepeatedLeftMostElement = 0; // Елемента, който ще се повтори най-много пъти

        // Обхождам дължината
        for (int i = 0; i < numArr.length; i++) {

            int currentCount = 1; // Започвам броенето на равните от 1

            // Вложен цикъл, от където е стигнал основния до предпоследния елемент
            for (int j = i; j < numArr.length - 1; j++) {

                int firstElement = numArr[i];
                int secondElement = numArr[j + 1];

                if (firstElement == secondElement) {

                    currentCount++;

                } else {

                    break;

                }

                // Презаписвам най-дългата намерена поредица
                // Ако намеря две еднакви, ще остане най-дълга тази от ляво - по условие
                if (totalCount < currentCount) {

                    totalCount = currentCount;
                    maxRepeatedLeftMostElement = numArr[i];

                }

            }

        }

        if (totalCount == 0) {
            // Може и без, това уточнение по условие
            System.out.println("No equal sequence of elements found!");

        } else {
            // Принтирам елемента, брой пъти, колкото съм го намерил
            for (int i = 0; i < totalCount; i++) {

                System.out.print(maxRepeatedLeftMostElement + " ");

            }

        }

    }

}
