package DataTypesVariables;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte kegs = Byte.parseByte(scanner.nextLine());

        double volumeCurrent = Double.MIN_VALUE; // <- Задавам първоначално, най-ниската стойност

        String biggestKeg = "";

        for (int i = 0; i < kegs; i++) {
            // Всеки кег си има модел, радиус, височина
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            // Изчислявам по формулата за обем -> π * r^2 * h
            double volume = Math.PI * Math.pow(radius, 2) * height;

            // Ако обемът е по-голям от първоначалния презаписвам стойностите
            if (volume >= volumeCurrent) {

                volumeCurrent = volume;
                biggestKeg = model;

            }

        }

        System.out.println(biggestKeg); // <- Най-големият кег

    }

}
