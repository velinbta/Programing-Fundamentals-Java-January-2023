package DataTypesVariables;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double result = Math.abs(firstNumber - secondNumber); // <- Резултат по Math.abs()

        boolean areEqual = result < 0.000001; // <- С точност 0.000001
        String equality = Boolean.toString(areEqual)
                .replace('t', 'T').replace('f', 'F');

        System.out.println(equality);

    }

}
