package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам масива от конзолата
        String[] treasureChestArr = scanner.nextLine().split("\\|");

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {

            // Правя масив от input и взимам командата на 0 позиция
            String[] inputArr = input.split("\\s+");
            String command = inputArr[0];

            switch (command) {
                case "Loot":

                    // Проверявам дали елементът от inputArr се съдържа в масива
                    for (int i = 1; i < inputArr.length; i++) {

                        boolean contains = false;

                        for (int j = 0; j < treasureChestArr.length; j++) {
                            String currentInputElement = inputArr[i];
                            String currentTreasureChestElement = treasureChestArr[j];

                            if (currentInputElement.equals(currentTreasureChestElement)) {
                                contains = true;
                                break;
                            }

                        }

                        if (!contains) {
                            // Ако не се съдържа, изваждам текущия масив, като String променлива
                            String currentChest = Arrays.toString(treasureChestArr).replaceAll("[\\[\\],]", "");
                            String currentElement = inputArr[i];
                            // Събирам в нова променлива текущия елемент и текущия масив
                            String newChest = currentElement + " " + currentChest;
                            // Презаписвам масива
                            treasureChestArr = newChest.split("\\s+");

                        }

                    }
                    break;

                case "Drop":
                    int positionIndex = Integer.parseInt(inputArr[1]);

                    // Проверявам дали е в границите на масива
                    if (positionIndex < treasureChestArr.length && positionIndex >= 0) {
                        // Взимам елемента, който ще добавя накрая
                        String dropElement = treasureChestArr[positionIndex];

                        for (int i = positionIndex; i < treasureChestArr.length - 1; i++) {
                            // Измествам елементите с един назад, като започвам от positionIndex
                            // и не включвам последния
                            treasureChestArr[i] = treasureChestArr[i + 1];

                        }

                        // На последно място слагам, който си запазих от positionIndex
                        treasureChestArr[treasureChestArr.length - 1] = dropElement;

                    } else {

                        break;

                    }

                    break;

                case "Steal":
                    int mustStealItems = Integer.parseInt(inputArr[1]);

                    // Ако, са в рамките на масива
                    if (mustStealItems >= 0 && mustStealItems < treasureChestArr.length) {
                        // Извеждам нова дължина
                        int newLength = treasureChestArr.length - mustStealItems;

                        // Обхождам от нея до края на масива
                        for (int i = newLength; i < treasureChestArr.length; i++) {

                            String currentElement = treasureChestArr[i];
                            System.out.print(currentElement);

                            if (i != treasureChestArr.length - 1) {

                                System.out.print(", ");

                            }

                        }

                        // Правя, нов масив с вече новата дължина
                        String[] tempChest = new String[newLength];

                        for (int i = 0; i < tempChest.length; i++) {
                            // Записвам елементите, без откраднатите
                            tempChest[i] = treasureChestArr[i];

                        }

                        // Презаписвам и основния масив
                        treasureChestArr = tempChest;

                        // В случай, че в масива няма да остане нищо - тоест ще откраднав всички елементи
                    } else if (mustStealItems > treasureChestArr.length - 1) {

                        for (int i = 0; i < treasureChestArr.length; i++) {

                            String currentElement = treasureChestArr[i];
                            System.out.print(currentElement);

                            if (i != treasureChestArr.length - 1) {

                                System.out.print(", ");

                            }

                        }
                        // Презаписвам масива - 0 елементи
                        treasureChestArr = new String[0];

                    }

                    System.out.println();
                    break;

            }


            input = scanner.nextLine();

        }

        // Взимам буквите на всички елементи от масива
        String treasureCharsOnly = Arrays.toString(treasureChestArr).replaceAll("[\\[\\], ]", "");

        if (treasureCharsOnly.length() != 0) {
            // Изчислявам дължината на всички букви, разделено на дължината на самите елементи вътре в
            // основния масив - treasureChestArr
            double averageTreasureGain = (1.0 * treasureCharsOnly.length()) / treasureChestArr.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);

        } else {
            // Ако буквите са 0
            System.out.println("Failed treasure hunt.");

        }

    }

}

