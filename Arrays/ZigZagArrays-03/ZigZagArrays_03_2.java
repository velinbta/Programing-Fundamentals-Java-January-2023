package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZigZagArrays_03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine()); // Брой редове

        // Създавам два списъка
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for (int i = 1; i <= numberOfLines; i++) {

            String numbers = scanner.nextLine();
            // Това, което прочитам го парсвам към int, като го отделям по whitespace+ "\\s+"
            int first = Integer.parseInt(numbers.split("\\s+")[0]);
            int second = Integer.parseInt(numbers.split("\\s+")[1]);

            // На нечетна итерация, добавям към първия списък - първото число, към втория - второто
            // на четна - обратното
            if (i % 2 != 0) {

                firstList.add(first);
                secondList.add(second);

            } else {

                secondList.add(first);
                firstList.add(second);

            }

        }

        System.out.println(firstList.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(secondList.toString().replaceAll("[\\[\\],]", ""));

    }

}
