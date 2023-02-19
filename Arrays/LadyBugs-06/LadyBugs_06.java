package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeField = Integer.parseInt(scanner.nextLine()); // <- Размер на масива

        int[] ladyBugsArr = new int[sizeField];

        // Получавам индексите, на които ще има калинки и запълвам празния масив "ladyBugsArr"
        int[] startingIndexesArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int currentIndex : startingIndexesArr) {

            if (isIndexInsideArrLength(ladyBugsArr.length, currentIndex)) { // <- Ако индексът е в рамките на масива
                ladyBugsArr[currentIndex] = 1; // <- Запълвам с калинка
            }

        }

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            // Получавам индекс, стъпки и посока - ляво, дясно
            String[] commandArr = input.split("\\s+");
            int index = Integer.parseInt(commandArr[0]);
            String direction = commandArr[1];
            int steps = Integer.parseInt(commandArr[2]);

            if (isIndexInsideArrLength(ladyBugsArr.length, index)) { // <- Ако получения индекс е в рамките на масива

                if (ladyBugsArr[index] != 0) { // <- Ако е 0, значи няма калинка, която да излети от тази позиция

                    // Проверям дали индексите, на които ще излети са в рамките на масива
                    boolean isInsideMovingRightInArray = isIndexInsideArrLength(ladyBugsArr.length, index + steps);
                    boolean isInsideMovingLeftInArray = isIndexInsideArrLength(ladyBugsArr.length, index - steps);
                    ladyBugsArr[index] = 0; // <- Излита

                    if (direction.equals("right")) { // <- Дясно

                        if (isInsideMovingRightInArray) { // <- Има къде да "кацне"

                            int startingIndex = index + steps; // <- От този индекс до края на масива

                            for (int i = startingIndex; i < ladyBugsArr.length; i++) {

                                int currentElement = ladyBugsArr[i];

                                if (currentElement == 0) { // <- Ако е празно, каца

                                    ladyBugsArr[i] = 1;
                                    break;

                                } else { // <- Ако има калинка на този индекс

                                    // Трябва да измине същата дължина (-1, за следващата инкрементация)
                                    i = (i + steps) - 1;

                                }

                            }

                        }

                    } else if (direction.equals("left")) { // <- Ляво

                        if (isInsideMovingLeftInArray) { // <- Има къде да "кацне"

                            int startingIndex = index - steps; // <- От този индекс до началото на масива

                            for (int i = startingIndex; i >= 0; i--) {

                                int currentElement = ladyBugsArr[i];

                                if (currentElement == 0) { // <- Ако е празно, каца

                                    ladyBugsArr[i] = 1;
                                    break;

                                } else { // <- Ако има калинка на този индекс

                                    // Трябва да измине същата дължина (+1, за следващата декрементация)
                                    i = (i - steps) + 1;

                                }

                            }

                        }

                    }

                }

            }

            input = scanner.nextLine();

        }

        Arrays.stream(ladyBugsArr).forEach(e -> System.out.print(e + " "));

    }

    private static boolean isIndexInsideArrLength(int lengthArr, int index) {

        return index >= 0 && index < lengthArr;

    }

}
