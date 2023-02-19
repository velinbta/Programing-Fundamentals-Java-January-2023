package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine()); // <- Брой редове/размер на масив
        int[] resultsArr = new int[lines]; // <- Съхранявам резултатите

        for (int i = 0; i < lines; i++) {

            String name = scanner.nextLine();
            int length = name.length(); // <- Взимам дължина

            int currentResult = 0;
            for (char current : name.toCharArray()) { // <- Обикалям всеки символ в името

                if (isVowel(current)) { // <- Ако е гласна

                    int vowelResult = current * length;
                    currentResult += vowelResult;

                } else { // <- Ако не е гласна

                    int consonantResult = current / length;
                    currentResult += consonantResult;

                }

            }

            resultsArr[i] = currentResult;

        }

        int[] sortedArr = returnSortedArrayInAscendingOrder(resultsArr); // <- Сортирам в нарастващ ред
        Arrays.stream(sortedArr).forEach(e -> System.out.println(e));

    }

    private static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'
                || ch == 'i' || ch == 'I';

    }

    private static int[] returnSortedArrayInAscendingOrder(int[] arr) {

        int[] sortedArr = new int[arr.length]; // <- Нов масив със същия размер

        int foundElements = arr.length;
        int index = 0;
        while (foundElements != 0) { // <- Докато не намеря толкова елемента, колкото има в масива

            int min = Integer.MAX_VALUE;
            int indexToRemove = 0;
            for (int i = 0; i < arr.length; i++) { // <- Намирам най-малкият елемент в масива (положителни числа)

                int element = arr[i];

                if (element < min && element != -1) {
                    min = element;
                    indexToRemove = i;
                }

            }

            sortedArr[index] = min; // <- Задавам нова стойност в новия масив
            arr[indexToRemove] = -1;
            index++;
            foundElements--; // <- Намалям броя на намерените, докато не станат 0

        }

        return sortedArr;

    }

}
