package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        // Два цикъла - от начало до предпоследен елемент
        for (int i = 0; i < numArr.length - 1; i++) {

            for (int j = i; j < numArr.length - 1; j++) {
                // Проверявам всеки един елемент от основния цикъл с елемент напред - на вложения
                int first = numArr[i];
                int second = numArr[j + 1];
                int sum = first + second;

                // Ако сумата е равна на магическото число, се принтира двойката
                if (sum == magicSum) {

                    System.out.print(first + " " + second);
                    System.out.println();

                }

            }

        }

    }

}
