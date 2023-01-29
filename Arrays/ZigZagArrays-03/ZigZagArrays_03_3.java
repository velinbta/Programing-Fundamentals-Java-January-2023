package Arrays;

import java.util.Scanner;

public class ZigZagArrays_03_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine()); // Брой редове

        // Правя два StringBuilder
        StringBuilder firstText = new StringBuilder();
        StringBuilder secondText = new StringBuilder();

        for (int i = 1; i <= numberOfLines; i++) {

            String numbers = scanner.nextLine();

            // Това, което прочитам го взимам като две отделни String променливи
            String firstNumber = numbers.split("\\s+")[0];
            String secondNumber = numbers.split("\\s+")[1];

            // На нечетна итерация, добавям към първия StringBuilder - първото число и празно място,
            // а към втория - второто
            // на четна - обратното
            if (i % 2 != 0) {

                firstText.append(firstNumber).append(" ");
                secondText.append(secondNumber).append(" ");

            } else {

                firstText.append(secondNumber).append(" ");
                secondText.append(firstNumber).append(" ");

            }

        }

        System.out.println(firstText);
        System.out.println(secondText);

    }

}
