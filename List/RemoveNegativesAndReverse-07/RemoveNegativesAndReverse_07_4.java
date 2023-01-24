package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получавам списък с числа
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // Премахвам, ако са по-малки от нула
        numList.removeIf(n -> n < 0);

        // Ако списъкът не е празен, принтирам в обратен ред
        if (numList.isEmpty()) {

            System.out.println("empty");

        } else {

            for (int i = numList.size() - 1; i >= 0; i--) {

                System.out.print(numList.get(i) + " ");

            }

        }

    }
}
