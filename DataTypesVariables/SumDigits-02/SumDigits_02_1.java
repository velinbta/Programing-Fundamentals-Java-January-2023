package DataTypesVariables;

import java.util.Scanner;

public class SumDigits_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sumTotal = 0; // <- Съхранявам общата сума на цифрите

        while (num > 0) { // <- Докато числото е по-голямо от 0

            int digit = num % 10; // <- Взимам последната цифра

            sumTotal += digit; // <- Добавям я към общата сума

            num = num / 10; // <- Махам последната цифра

        }

        System.out.println(sumTotal);

    }

}
