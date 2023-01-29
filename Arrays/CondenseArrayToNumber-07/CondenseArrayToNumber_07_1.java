package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        // Два вложени цикъла - събира се всеки елемент с един напред, докато първа позиция
        // на масива стане желаното кондензирано число (Това е без да бъде кондензиран масивът до 1 число!)
        for (int i = 0; i < numArr.length - 1; i++) {

            for (int j = 0; j < numArr.length - 1; j++) {

                int firstElement = numArr[j];
                int secondElement = numArr[j + 1];

                numArr[j] = firstElement + secondElement;

            }

        }

        System.out.println(numArr[0]);

    }

}
