package DataTypesVariables;

import java.math.BigInteger;
import java.util.Scanner;

public class SumDigits_02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger num = scanner.nextBigInteger(); // <- Прочитам числото като BigInteger

        BigInteger sumTotal = BigInteger.valueOf(0); // <- Съхранявам общата сума на цифрите

        while (!num.equals(BigInteger.valueOf(0))) { // <- Докато е различно от 0

            BigInteger digit = num.remainder(BigInteger.valueOf(10)); // <- Взимам последната цифра

            sumTotal = sumTotal.add(digit); // <- Добавям я към общата сума

            // Когато не останат цифри, num ще стане 0 и условието на while няма да се изпълни
            num = num.divide(BigInteger.valueOf(10)); // <- Махам последната цифра

        }

        System.out.println(sumTotal);

    }

}
