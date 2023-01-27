package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        String input = scanner.nextLine();

        // Докато input не стане "end"
        while (!input.equals("end")) {
            // Разделям input, взимам командата на позиция 0
            String[] inputArr = input.split("\\s+");
            String command = inputArr[0];

            switch (command) {
                case "swap": {

                    // От input взимам първия и втория индекс
                    int firstIndex = Integer.parseInt(inputArr[1]);
                    int secondIndex = Integer.parseInt(inputArr[2]);

                    // Взимам си първоначалния индекс от масива, за да не се изгуби
                    int initialFirstIndex = numArr[firstIndex];

                    // Разменям им местата
                    numArr[firstIndex] = numArr[secondIndex];
                    numArr[secondIndex] = initialFirstIndex;
                    break;

                }
                case "multiply": {

                    // От input взимам първия и втория индекс
                    int firstIndex = Integer.parseInt(inputArr[1]);
                    int secondIndex = Integer.parseInt(inputArr[2]);

                    // Умножавам и запаметявам на първи индекс
                    int product = numArr[firstIndex] * numArr[secondIndex];
                    numArr[firstIndex] = product;

                    break;

                }
                case "decrease":
                    // Намалям всички елементи с 1
                    for (int i = 0; i < numArr.length; i++) {

                        numArr[i] = numArr[i] - 1;

                    }

                    break;

            }

            input = scanner.nextLine();

        }


        for (int i = 0; i < numArr.length; i++) {

            if (i != numArr.length - 1) {

                System.out.printf("%d, ", numArr[i]);

            } else {

                System.out.printf("%d ", numArr[i]);

            }

        }

    }

}
