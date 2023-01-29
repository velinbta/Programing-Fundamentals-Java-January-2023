package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayRotation_04_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        int numberOfRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRotations; i++) {
            // Взимам първия елемент и го добавям накрая
            // Премахвам нулевия
            String firstElement = stringList.get(0);
            stringList.add(firstElement);
            stringList.remove(0);

        }

        System.out.println(stringList.toString().replaceAll("[\\[\\],]", ""));

    }

}
