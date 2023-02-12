package DataTypesVariables;

import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToTheRight_02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {

            String[] numbersAsStringArr = scanner.nextLine().split("\\s+"); // <- Взимам двете числа по отделно

            // Парсвам ги към long - те ми трябват за проверката
            long firstNumber = Long.parseLong(numbersAsStringArr[0]);
            long secondNumber = Long.parseLong(numbersAsStringArr[1]);

            // Отделям всичко, което не е цифра и правя два масива само с цифрите - от първото и второто число
            int[] firstDigitArr = Arrays.stream(numbersAsStringArr[0].replaceAll("\\D", "").split(""))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();
            int[] secondDigitArr = Arrays.stream(numbersAsStringArr[1].replaceAll("\\D", "").split(""))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();

            if (firstNumber >= secondNumber) {

                int sumFirst = Arrays.stream(firstDigitArr).sum(); // <- Сумата на цифрите на първото число

                System.out.println(sumFirst);

            } else {

                int sumSecond = Arrays.stream(secondDigitArr).sum(); // <- Сумата на цифрите на второто число

                System.out.println(sumSecond);

            }

        }

    }

}
