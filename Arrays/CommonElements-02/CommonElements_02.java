package ArraysExercises;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам два масива от конзолата
        String[] firstArr = scanner.nextLine().split("\\s+");
        String[] secondArr = scanner.nextLine().split("\\s+");

        // Понеже по условие, трябва да се проверят общите от втория с първия,
        // започвам от втория
        for (String sec : secondArr) {

            for (String fir : firstArr) {

                if (sec.equals(fir)) {
                    // Принтирам само ако са еднакви
                    System.out.printf("%s ", sec);

                }

            }

        }

    }

}
