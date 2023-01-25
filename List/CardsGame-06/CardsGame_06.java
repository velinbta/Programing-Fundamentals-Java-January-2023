package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам два листа - картите на първия и втория играч
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        // Докато, някой от списъците не се изпразни
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {

            int firstPlayerNum = firstPlayer.get(0);
            int secondPlayerNum = secondPlayer.get(0);

            if (firstPlayerNum > secondPlayerNum) {
                // Ако на първия е по-силна картата добавям му и двете накрая и
                // премахвам първите индекси
                firstPlayer.add(firstPlayerNum);
                firstPlayer.add(secondPlayerNum);

                firstPlayer.remove(0);
                secondPlayer.remove(0);

            } else if (secondPlayerNum > firstPlayerNum) {
                // Ако на втория е по-силна картата добавям му и двете накрая и
                // премахвам първите индекси
                secondPlayer.add(secondPlayerNum);
                secondPlayer.add(firstPlayerNum);

                secondPlayer.remove(0);
                firstPlayer.remove(0);

            } else if (firstPlayer.get(0).equals(secondPlayer.get(0))) {
                // Ако са равни се премахват и на първия и на втория играч
                firstPlayer.remove(0);
                secondPlayer.remove(0);

            }

        }

        // Този, който не е празния списък - се събира резултата и побеждава
        if (!firstPlayer.isEmpty()) {

            int sum = 0;

            for (int current : firstPlayer) {

                sum += current;

            }

            System.out.printf("First player wins! Sum: %d%n", sum);

        } else if (!secondPlayer.isEmpty()) {

            int sum = 0;

            for (int current : secondPlayer) {

                sum += current;

            }

            System.out.printf("Second player wins! Sum: %d%n", sum);

        }

    }

}
