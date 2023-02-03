package DataTypesVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersTotal = Integer.parseInt(scanner.nextLine()); // <- Прочитам, колко числа ще получа

        BigDecimal sumTotal = BigDecimal.valueOf(0); // <- Първоначална стойност 0

        for (int i = 0; i < numbersTotal; i++) {

            BigDecimal number = scanner.nextBigDecimal();

            sumTotal = sumTotal.add(number); // <- Добавям всяко число

        }

        System.out.println(sumTotal);

    }

}
