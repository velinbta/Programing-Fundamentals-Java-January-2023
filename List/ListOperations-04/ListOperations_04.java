package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получавам списък с числа и String променлива с команди
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            // Правя масив, от който ще си взимам командата и индексите
            String[] cmdList = input.split("\\s+");
            String command = cmdList[0];

            switch (command) {

                // Търся по командата
                case "Add":
                    int numberToAdd = Integer.parseInt(cmdList[1]);
                    numList.add(numberToAdd); // Добавям го към списъка
                    break;

                case "Insert":
                    int numberToInsert = Integer.parseInt(cmdList[1]);
                    int indexToInsert = Integer.parseInt(cmdList[2]);
                    // Методът ми проверява, дали е валиден индексът
                    // Ако е добавям числото
                    if (checkIfIndexIsInvalid(indexToInsert, numList)) {

                        System.out.println("Invalid index");

                    } else {

                        numList.add(indexToInsert, numberToInsert);

                    }

                    break;

                case "Remove":
                    int indexToRemove = Integer.parseInt(cmdList[1]);
                    // Методът ми проверява, дали е валиден индексът
                    // Ако е го премахвам
                    if (checkIfIndexIsInvalid(indexToRemove, numList)) {

                        System.out.println("Invalid index");

                    } else {

                        numList.remove(indexToRemove);

                    }

                    break;

                case "Shift":
                    //  Shift left {count} - first number becomes last 'count' times
                    //  Shift right {count} - last number becomes first 'count' times
                    String leftOrRight = cmdList[1];

                    // Броя пъти, който ще се мести индексът
                    int count = Integer.parseInt(cmdList[2]);

                    if (leftOrRight.equals("left")) {

                        for (int i = 0; i < count; i++) {
                            // Взимам първото число, добавям го накрая и премахвам 0 индекс
                            int firstNum = numList.get(0);
                            numList.add(firstNum);
                            numList.remove(0);

                        }

                    } else if (leftOrRight.equals("right")) {

                        for (int i = 0; i < count; i++) {
                            // Вдимам последното число, добавям го на 0 индекс и премахвам последния
                            int lastNum = numList.get(numList.size() - 1);
                            numList.add(0, lastNum);
                            numList.remove(numList.size() - 1);

                        }

                    }

            }

            input = scanner.nextLine();
        }

        System.out.print(numList.toString().replaceAll("[\\[\\],]", ""));

    }

    private static boolean checkIfIndexIsInvalid(int indexToRemove, List<Integer> numList) {

        return indexToRemove > numList.size() || indexToRemove < 0;

    }

}
