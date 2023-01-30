package BasicSyntax;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Входът е първоначалният час и минути
        int initHours = Integer.parseInt(scanner.nextLine());
        int initMin = Integer.parseInt(scanner.nextLine());

        // Преобръщам всичко в една мярна единица
        int allTime = (initHours * 60) + initMin + 30;

        // Взимам часовете
        int hour = allTime / 60;

        // Взимам минутите
        int min = allTime % 60;

        // Ако часът стане над 23 го нулирам
        if (hour > 23) {

            hour = 0;

        }

        String result = String.format("%d:%02d", hour, min);

        System.out.println(result);

    }

}
