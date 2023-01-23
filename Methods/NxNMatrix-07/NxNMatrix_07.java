package MethodsExercises;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Числото ще е броя на редовете и колоните
        int n = Integer.parseInt(scanner.nextLine());

        // Методът принтира n на брой колини и редове
        printEqualToNRowsAndColumns(n);

    }

    public static void printEqualToNRowsAndColumns(int n) {
        // Два вложени цикъла за редовете и колоните
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(n + " ");

            }

            System.out.println();

        }

    }


}
