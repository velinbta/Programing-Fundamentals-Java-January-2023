package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine()); // <- Брой редове/размер на масив
        int[] resultsArr = new int[lines]; // <- Съхранявам резултатите

        for (int i = 0; i < lines; i++) {

            String name = scanner.nextLine();
            int length = name.length(); // <- Взимам дължина
            char[] nameArr = name.toCharArray();

            int currentResult = 0;
            for (char current : nameArr) { // <- Обикалям всеки символ в името

                int value = isVowel(current)
                        ? current * length // <- Ако е гласна
                        : current / length; // <- Ако не е гласна

                currentResult += value;

            }

            resultsArr[i] = currentResult;

        }

        Arrays.sort(resultsArr); // <- Сортирам във възходящ ред
        Arrays.stream(resultsArr).forEach(value -> System.out.println(value));

    }

    private static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'
                || ch == 'i' || ch == 'I';

    }

}
