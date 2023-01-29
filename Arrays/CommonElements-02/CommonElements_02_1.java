package Arrays;

import java.util.Scanner;

public class CommonElements_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам два масива от конзолата
        String[] firstArr = scanner.nextLine().split("\\s+");
        String[] secondArr = scanner.nextLine().split("\\s+");

        // Понеже по условие, трябва да се проверят общите елементи
        // от втория с първия, започвам от втория
        for (String second : secondArr) {

            for (String first : firstArr) {

                if (second.equals(first)) {
                    // Принтирам само ако са еднакви
                    System.out.printf("%s ", second);

                }

            }

        }

    }

}
