package DataTypesVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal pounds = scanner.nextBigDecimal(); // <- От конзолата прочитам като BigDecimal

        BigDecimal dollarsPerPound = new BigDecimal("1.36"); // <- Взимам фиксирания курс

        BigDecimal dollarsTotal = pounds.multiply(dollarsPerPound); // <- Умножавам по дадения курс

        System.out.printf("%.3f", dollarsTotal);

    }

}
