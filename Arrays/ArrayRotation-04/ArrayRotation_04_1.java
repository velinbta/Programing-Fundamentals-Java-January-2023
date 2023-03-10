package Arrays;

import java.util.Scanner;

public class ArrayRotation_04_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам масива от конзолата
        String[] arr = scanner.nextLine().split("\\s+");

        int rotations = Integer.parseInt(scanner.nextLine()); // Брой ротации

        for (int i = 0; i < rotations; i++) {

            for (int j = 0; j < arr.length; j++) {
                // Взимам последния елемент - да не се загуби
                // Слагам му и "- j", защото искам да го измествам с всяка една итерация на цикъла,
                // като започвам от последния и стигам до първия
                String lastElement = arr[arr.length - 1 - j];

                arr[arr.length - 1 - j] = arr[0]; // на мястото на последния слагам първия
                arr[0] = lastElement; // а на първия, слагам последния

            }

        }

        for (String current : arr) {

            System.out.print(current + " ");

        }

    }

}
