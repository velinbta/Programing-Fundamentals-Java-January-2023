package BasicSyntax;

import java.util.Scanner;

public class RefactorSumOfOddNumbers_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         /*

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 1;
        for (int i = 0; i <= n; i++) {
             System.out.print(2 * i + 1);
             sum += 2 * i;
                }
            System.out.printf("Sum: %d%n", sum);

         */

        int number = Integer.parseInt(sc.nextLine());

        int sum = 0; // Вместо 1

        for (int i = 0; i < number; i++) { // Без да включвам number

            System.out.println(2 * i + 1); // На нов ред

            sum += ((2 * i) + 1); // Добавям + 1

        }

        System.out.printf("Sum: %d%n", sum);

    }

}