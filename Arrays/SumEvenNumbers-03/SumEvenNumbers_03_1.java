package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenElementsSum = 0;
        // Обхождам масива и събирам числата, който се делят на 2 - четни
        for (int number : numArr) {

            if (number % 2 == 0) {

                evenElementsSum += number;

            }

        }

        System.out.println(evenElementsSum);

    }

}
