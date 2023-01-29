package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам два масива с числа
        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] secondArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean areIdentical = true;

        int sumFirst = 0;
        // Търся дали са еднакви - необходимо е да обходя един от двата
        for (int i = 0; i < firstArr.length; i++) {
            sumFirst += firstArr[i];

            int elementFirst = firstArr[i];
            int elementSecond = secondArr[i];

            if (elementFirst != elementSecond) {
                // Ако са различни, принтирам къде е разликата и приключвам
                areIdentical = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;

            }

        }

        if (areIdentical) {
            // Сумата на първия масив
            System.out.printf("Arrays are identical. Sum: %d", sumFirst);

        }

    }

}
