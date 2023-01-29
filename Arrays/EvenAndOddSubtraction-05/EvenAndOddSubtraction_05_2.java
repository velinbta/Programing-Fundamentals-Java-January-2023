package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        // Филтрирам четните и нечетните, като ги събирам в отделни променливи
        int evenSum = Arrays.stream(numArr).filter(e -> e % 2 == 0).sum();
        int oddSum = Arrays.stream(numArr).filter(e -> e % 2 != 0).sum();

        // От четната сума вадя нечетната
        int result = evenSum - oddSum;
        System.out.println(result);

    }

}
