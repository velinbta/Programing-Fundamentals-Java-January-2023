package DataTypesVariables;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte lines = Byte.parseByte(scanner.nextLine());

        int litersTotal = 0; // <- Общо литри
        for (int i = 0; i < lines; i++) {

            int litersToCome = Integer.parseInt(scanner.nextLine());
            int currentTotalLiters = litersTotal + litersToCome; // <- Не трябва да надвишават капацитета

            // Ако надвишава капацитета, не ги добавям към "litersTotal"
            if (currentTotalLiters > 255) { // <- Капацитетът му е 255

                System.out.println("Insufficient capacity!");

            } else {

                litersTotal += litersToCome;

            }

        }

        System.out.println(litersTotal);

    }

}
