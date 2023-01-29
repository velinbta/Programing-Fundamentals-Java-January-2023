package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        // Дължината, която ще обходя, целочислено разделена на 2
        // Така, ако е нечетен масива средния елемент ще остане непроменен
        int length = inputArr.length / 2;

        for (int i = 0; i < length; i++) {
            // Взимам елемента - да не се изгуби
            String oldElement = inputArr[i];

            // Разменям ги, като всеки път ходя един елемент - още назад
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = oldElement;

        }

        System.out.print(Arrays.toString(inputArr).replaceAll("[\\[\\],]", ""));

    }

}
