package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_09_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String input = scanner.nextLine();

        // Докато input не стане "end"
        while (!input.equals("end")) {
            // Разделям input, взимам командата на позиция 0
            String[] inputArr = input.split("\\s+");
            String command = inputArr[0];

            switch (command) {

                case "swap":
                    // От input взимам първия и втория индекс
                    int firstIndex = Integer.parseInt(inputArr[1]);
                    int secondIndex = Integer.parseInt(inputArr[2]);

                    // Взимам първия и втория елемент и им разменям местата
                    int firstElement = numList.get(firstIndex);
                    int secondElement = numList.get(secondIndex);
                    numList.set(firstIndex, secondElement);
                    numList.set(secondIndex, firstElement);

                    break;
                case "multiply":
                    // От input взимам първия и втория индекс
                    int firstIndexMultiply = Integer.parseInt(inputArr[1]);
                    int secondIndexMultiply = Integer.parseInt(inputArr[2]);

                    // Умножавам и запаметявам на първи индекс
                    int result = numList.get(firstIndexMultiply) * numList.get(secondIndexMultiply);
                    numList.set(firstIndexMultiply, result);

                    break;
                case "decrease":
                    // Намалям всички елементи с 1
                    numList = numList.stream().map(e -> e - 1).collect(Collectors.toList());

                    break;

            }

            input = scanner.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\]]", ""));

    }

}
