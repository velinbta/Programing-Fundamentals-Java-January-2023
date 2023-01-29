package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        // Докато масивът е по-голям от 1
        while (numArr.length > 1) {

            // Кондензираният масив е с един елемент по-малък, докато стане само едно число
            int[] condensed = new int[numArr.length - 1];

            for (int i = 0; i < numArr.length - 1; i++) {

                int firstElement = numArr[i];
                int secondElement = numArr[i + 1];

                condensed[i] = firstElement + secondElement;

            }

            // На основния масив му се дава нова стойност - кондензираният такъв
            numArr = condensed;

        }

        // Принтира се единствения останал елемент в масива, който ще стане на позиция 0
        System.out.println(numArr[0]);

    }

}
