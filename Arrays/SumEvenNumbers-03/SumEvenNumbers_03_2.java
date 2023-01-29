package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам масива и филтрирам само четните
        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).filter(e -> e % 2 == 0).toArray();

        // Събирам числата в масива и принтирам
        int evenElementsSum = Arrays.stream(numArr).sum();

        System.out.println(evenElementsSum);

    }

}
