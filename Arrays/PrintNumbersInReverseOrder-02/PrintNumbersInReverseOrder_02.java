package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numArr = new int[n]; // Правя масив от n числа

        for (int i = 0; i < numArr.length; i++) {
            // Наливам ги с масива
            numArr[i] = Integer.parseInt(scanner.nextLine());

        }

        // Принтирам ги в обратен ред
        for (int i = numArr.length - 1; i >= 0; i--) {

            System.out.print(numArr[i] + " ");

        }

    }

}
