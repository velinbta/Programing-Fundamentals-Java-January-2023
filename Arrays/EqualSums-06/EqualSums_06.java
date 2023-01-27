package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isFound = false;
        for (int i = 0; i < numArr.length; i++) {  // Обхождам дължината

            // За всяка итерация търся дали има равни - леви и десни суми
            int leftSum = 0;
            int rightSum = 0;

            // Обхождам до текущия индекс в масива - без да го включвам
            for (int leftIndex = 0; leftIndex < i; leftIndex++) {

                leftSum += numArr[leftIndex];

            }

            // Обхождам от i + 1 - за да не включвам текущия индекс
            for (int rightIndex = i + 1; rightIndex < numArr.length; rightIndex++) {

                rightSum += numArr[rightIndex];

            }

            if (leftSum == rightSum) {
                // Ако са равни, принтирам текущия индекс и прекратявам основния цикъл
                System.out.println(i);
                isFound = true;
                break;

            }

        }

        if (!isFound) {
            // Ако не намеря равни
            System.out.println("no");

        }

    }

}
