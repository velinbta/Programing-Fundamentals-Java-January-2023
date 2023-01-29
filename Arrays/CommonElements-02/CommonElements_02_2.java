package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CommonElements_02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам два списъка
        List<String> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        List<String> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        // Понеже по условие, трябва да се проверят общите елементи
        // от втория с първия, започвам от втория
        for (String second : secondList) {

            for (String first : firstList) {

                if (second.equals(first)) {

                    System.out.print(second + " ");

                }

            }

        }

    }

}
