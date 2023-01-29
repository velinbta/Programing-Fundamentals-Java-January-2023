package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasureList = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            // Правя масив от input и взимам командата на 0 позиция
            String[] inputArr = input.split("\\s+");
            String command = inputArr[0];

            switch (command) {

                case "Loot":
                    // Ако елементът, не се съдържа в списъка го добавям на позиция 0
                    for (int i = 1; i < inputArr.length; i++) {
                        String element = inputArr[i];

                        if (!treasureList.contains(element)) {

                            treasureList.add(0, element);

                        }

                    }

                    break;

                case "Drop":
                    int index = Integer.parseInt(inputArr[1]);

                    // Проверявам дали индексът е в границите на списъка
                    if (index >= 0 && index < treasureList.size()) {
                        // Ако е премествам елемента най-отзад и премахвам индекса
                        treasureList.add(treasureList.get(index));
                        treasureList.remove(index);
                    }

                    break;

                case "Steal":
                    int count = Integer.parseInt(inputArr[1]);
                    int startingSize = treasureList.size() - count;

                    // Ако това, което ще остане е по-голямо или равно на 0
                    if (startingSize >= 0) {

                        // Обхождам и принтирам, откраднатите от променливата startingSize, до края
                        for (int i = startingSize; i < treasureList.size(); i++) {

                            if (i != treasureList.size() - 1) {
                                System.out.print(treasureList.get(i) + ", ");
                            } else {
                                System.out.print(treasureList.get(i));
                            }

                        }
                        // Трябва да има нов ред, за да може на друга команда
                        // Steal - да принтира на нов ред
                        System.out.println();

                        // Премахвам откраднатите
                        treasureList.removeAll(treasureList.subList(startingSize, treasureList.size()));

                    } else {
                        // Ако няма да остане нищо в списъка, принтирам всичко и трия списъка
                        System.out.println(treasureList.toString().replaceAll("[\\[\\]]", ""));
                        treasureList.clear();

                    }

                    break;

            }

            input = scanner.nextLine();

        }

        if (treasureList.size() != 0) {

            // Взимам буквите на всички елементи от списъка
            String treasureCharsOnly = treasureList.toString().replaceAll("[\\[\\], ]", "");

            // Изчислявам дължината на всички букви, разделено на дължината на самите елементи в списъка
            double average = treasureCharsOnly.length() / (treasureList.size() * 1.0);
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", average);

        } else {

            System.out.print("Failed treasure hunt.");

        }

    }

}