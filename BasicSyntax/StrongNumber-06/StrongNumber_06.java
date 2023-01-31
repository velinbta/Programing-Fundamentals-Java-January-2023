package BasicSyntax;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNumber = Integer.parseInt(scanner.nextLine());

        // Ще ми трябва първоначалното число, затова изкарвам същото за обработване
        int manipulateNumber = initialNumber;

        int totalSum = 0; // Сумата на събраните факториели на всички цифри
        while (manipulateNumber > 0) {

            int digit = manipulateNumber % 10; // <- Взимам последната цифра
            int sum = 1;
            // Изчислявам факториела на цифрата
            for (int i = 1; i <= digit; i++) {

                sum = sum * i;

            }

            totalSum += sum; // Добавям към общата сума

            manipulateNumber = manipulateNumber / 10; // <- Махам последната цифра

        }

        if (totalSum == initialNumber) {

            System.out.println("yes");

        } else {

            System.out.println("no");

        }

    }

}
