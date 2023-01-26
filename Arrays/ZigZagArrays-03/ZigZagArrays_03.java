package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine()); // Брой редове
        // Съзвадам два масива
        int[] firstArr = new int[lines];
        int[] secondArr = new int[lines];

        for (int i = 0; i < lines; i++) {

            String numbers = scanner.nextLine();
            // Това, което прочитам го парсвам към int, като го отделям по whitespace+ "\\s+"
            int firstNumber = Integer.parseInt(numbers.split("\\s+")[0]);
            int secondNumber = Integer.parseInt(numbers.split("\\s+")[1]);

            // На четна итерация, добавям към първия масив - първото число, към втория - второто
            // на нечетна - обратното
            if (i % 2 == 0) {

                firstArr[i] = firstNumber;
                secondArr[i] = secondNumber;

            } else {

                firstArr[i] = secondNumber;
                secondArr[i] = firstNumber;

            }

        }


        System.out.println(Arrays.toString(Arrays.stream(firstArr).toArray()).replaceAll("[\\[\\],]", ""));
        System.out.println(Arrays.toString(Arrays.stream(secondArr).toArray()).replaceAll("[\\[\\],]", ""));


    }

}
