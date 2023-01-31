package BasicSyntax;

import java.util.Scanner;

public class PrintAndSum_04_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получавам начало и край
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        // Принтирам числата от началото до края и ги събирам
        for (int i = start; i <= end; i++) {

            sum += i;

            System.out.print(i + " ");

        }

        System.out.println();
        System.out.printf("Sum: %d", sum);

    }

}
