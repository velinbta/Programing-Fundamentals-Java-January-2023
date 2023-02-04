package ObjectsClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам две числа от класа BigInteger, събирам ги и принтирам
        BigInteger firstNumber = scanner.nextBigInteger();
        BigInteger secondNumber = scanner.nextBigInteger();

        BigInteger product = firstNumber.add(secondNumber);

        System.out.println(product);

    }

}
