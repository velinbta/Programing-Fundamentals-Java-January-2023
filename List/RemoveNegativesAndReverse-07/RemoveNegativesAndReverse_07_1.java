package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // По условие се премахват, но в това решение предлагам:
        // Прочитам списък от конзолата
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        boolean isEmpty = true;
        // Трябва да са в обратен ред, цъкълът започва от последния към първия елемент
        for (int i = numList.size() - 1; i >= 0; i--) {

            if (numList.get(i) > 0) {
                // Ако има число по-голямо от нула, значи списъкът не е празен
                isEmpty = false;
                System.out.print(numList.get(i) + " ");

            }

        }

        if (isEmpty) {

            System.out.println("empty");

        }

    }

}
