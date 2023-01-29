package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        // Обхождам масива и в две променливи държа четните и нечетните суми
        int evenSum = 0;
        int oddSum = 0;

        for (int element : numArr) {

            if (element % 2 == 0) {

                evenSum = evenSum + element;

            } else {

                oddSum = oddSum + element;

            }

        }

        // От четната сума вадя нечетната
        int result = evenSum - oddSum;
        System.out.println(result);

    }

}
