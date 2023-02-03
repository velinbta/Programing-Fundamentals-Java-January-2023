package DataTypesVariables;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceInMeters = Integer.parseInt(scanner.nextLine());

        // Умножавам метрите по 1000.0 за да ги превърна в дробно число
        double distanceInKilometers = distanceInMeters / 1000.0;

        System.out.printf("%.2f", distanceInKilometers);

    }

}

