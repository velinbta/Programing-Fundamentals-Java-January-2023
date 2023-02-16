package ExamsFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList()); // <- Елементи

        String command = scanner.nextLine();

        int moves = 0;

        // И двете условия искам да са вярни, за да влезе в цикъла
        // Тоест ако списъкът свърши, играчът печели
        while (!command.equals("end") && !elementsList.isEmpty()) {

            moves++;
            int[] indexArr = Arrays.stream(command.split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e)).toArray(); // <- Ако командата не е "end", то това са индекси

            int middleOfSequence = elementsList.size() / 2; // <- Средата, където ще добавям елементи

            int firstIndex = indexArr[0];
            int secondIndex = indexArr[1];

            // При false, добавям елементите в средата на списъка
            boolean isInvalid = firstIndex == secondIndex || firstIndex < 0 || secondIndex < 0
                    || firstIndex > elementsList.size() - 1 || secondIndex > elementsList.size() - 1;

            if (isInvalid) {

                System.out.println("Invalid input! Adding additional elements to the board");
                String additional = String.format("-%da", moves); // <- Добавям два пъти
                elementsList.add(middleOfSequence, additional);
                elementsList.add(middleOfSequence, additional);

            } else {

                String firstElement = elementsList.get(firstIndex);
                String secondElement = elementsList.get(secondIndex);

                if (firstElement.equals(secondElement)) { // <- Ако са еднакви

                    System.out.printf("Congrats! You have found matching elements - %s!\n"
                            , elementsList.get(firstIndex));

                    // Намирам по-големия и по-малкия, за да премахна задължително по-големия първо
                    int greatestIndexOfTwo = Math.max(firstIndex, secondIndex);
                    int minorIndexOfTwo = Math.min(firstIndex, secondIndex);

                    elementsList.remove(greatestIndexOfTwo); // Math.max(), Max.min()
                    elementsList.remove(minorIndexOfTwo);

                } else { // <- Ако са различни

                    System.out.println("Try again!");

                }

            }

            command = scanner.nextLine();

        }

        if (elementsList.isEmpty()) { // <- Ако списъкът Е празен, преди команда "end", печели

            System.out.printf("You have won in %d turns!\n", moves);

        } else {

            System.out.println("Sorry you lose :(");
            elementsList.forEach(e -> System.out.print(e + " ")); // <- Оставащите елементи

        }

    }

}
