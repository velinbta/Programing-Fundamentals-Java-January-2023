package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine()); // Числото
        int toThePowerOf = Integer.parseInt(scanner.nextLine()); // На степен

        // df ще ми създаде клас, който ще ми форматира int без запетай, а double ще го остави с
        DecimalFormat df = new DecimalFormat("0.####");

        // Може и да се използва Math.pow, но идеята е да се създаде метод, не готов такъв
        double pow = getThePowerOfNumber(num, toThePowerOf);

        // При принтирането прилагам и класа DecimalFormat
        System.out.println(df.format(pow));

    }

    public static double getThePowerOfNumber(double num, int toThePowerOf) {

        double powerOf = num;
        for (int i = 1; i < toThePowerOf; i++) {

            powerOf *= num;
        }

        return powerOf;
    }
}
