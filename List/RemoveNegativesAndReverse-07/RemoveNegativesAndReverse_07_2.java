package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получавам списък с числа
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // Започвам да премахвам в обратен ред, ако са по-малки от нула
        for (int i = numList.size() - 1; i >= 0; i--) {

            if (numList.get(i) < 0) {

                numList.remove(i);

            }

        }

        // Ако не е празен - принтирам в обратен ред
        if (numList.isEmpty()) {

            System.out.println("empty");

        } else {

            for (int i = numList.size() - 1; i >= 0; i--) {

                System.out.print(numList.get(i) + " ");

            }

        }

    }
}
