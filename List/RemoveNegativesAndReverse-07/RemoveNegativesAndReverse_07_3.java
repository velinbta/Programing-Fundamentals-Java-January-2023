package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07_3 {
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

        // Взимам размера - целочислено разделен на 2
        // При нетечен брой, последния елемент ми остава непроменен
        int size = numList.size() / 2;

        for (int i = 0; i < size; i++) {
            // Размествам първите и последни елементи
            int firstElement = numList.get(i);
            int lastElement = numList.get(numList.size() - 1 - i);

            numList.set(i, lastElement);
            numList.set(numList.size() - 1 - i, firstElement);

        }


        if (numList.isEmpty()) {

            System.out.println("empty");

        } else {

            for (int current : numList) {

                System.out.print(current + " ");

            }

        }

    }

}
