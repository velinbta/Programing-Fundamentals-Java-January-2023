package BasicSyntax;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAndSum_04_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получавам начало и край
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        // Определям дължината на масива и го създавам
        int lengthArr = Math.abs(start - end) + 1;
        int[] numArr = new int[lengthArr];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = start; // <- Добавям елементите на масива

            System.out.printf("%d ", start);
            start++; // <- На всяка итерация увеличавам, числото което ще добавям

        }

        // Изчислявам общата сума на елементите вътре в масива
        int sumArr = Arrays.stream(numArr).sum();

        System.out.println();
        System.out.printf("Sum: %d", sumArr);

    }

}
