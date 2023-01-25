package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам лист и масив с числа
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // От масива на 0 позиция ми е специалното число, на 1 - първоначалната сила
        int[] specialArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int specialNumber = specialArr[0];
        int initialPower = specialArr[1];

        int power = initialPower; // <- Колко числа ще премахна от ляво на дясно
        for (int i = 0; i < numList.size(); i++) {

            int currentElement = numList.get(i); // Текущото число в списъка
            if (currentElement == specialNumber) {

                // Докато силата е по-голяма от 0 - премахвам числата отляво
                while (power > 0) {
                    // Гарантирам си, че няма да изляза извън списъка
                    if (i - 1 >= 0) {

                        numList.remove(i - 1);
                        i -= 1;
                        power--;

                    } else {

                        break;

                    }

                }
                // Възстановявам си силата, за да премахна и тези от дясно
                power = initialPower;

                while (power > 0) {
                    // Гарантирам си, че няма да изляза извън списъка
                    if (i + 1 <= numList.size() - 1) {

                        numList.remove(i + 1);
                        power--;

                    } else {

                        break;

                    }

                }

                // Възстановявам си силата, ако има следващи "специални числа"
                power = initialPower;

            }

        }

        int sum = 0;
        // Събирам всичко, което остава, освен "специалните числа"
        for (int current : numList) {

            if (current != specialNumber) {

                sum += current;

            }

        }

        System.out.println(sum);

    }

}
