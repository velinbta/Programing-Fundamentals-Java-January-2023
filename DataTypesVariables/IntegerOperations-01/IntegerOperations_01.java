package DataTypesVariables;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам 4 числа
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int forthNum = Integer.parseInt(scanner.nextLine());

        int addSecond = firstNum + secondNum; // <- Събирам първо и второ
        int divideThird = addSecond / thirdNum; // <- Деля полученото на третото
        int result = divideThird * forthNum; // <- Умножавам полученото с четвъртото

        System.out.println(result);

    }

}
