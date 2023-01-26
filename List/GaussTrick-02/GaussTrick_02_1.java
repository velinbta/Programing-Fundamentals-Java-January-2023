package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // За итерациите на цикъла ще използвам размера на списъка
        // целочислено разделен на две: пример - 5 / 2 = 2, 4 / 2 = 2;
        // При нечетен брой елемента, който е по средата няма да се променя
        int size = numList.size() / 2;

        for (int i = 0; i < size; i++) {

            // Събирам елемента на i позиция и последно място, слагам го на i позиция
            // Премахвам последния елемент
            int sum = numList.get(i) + numList.get(numList.size() - 1);
            numList.set(i, sum);
            numList.remove(numList.size() - 1);

        }

        numList.forEach(e -> System.out.print(e + " "));

    }

}
