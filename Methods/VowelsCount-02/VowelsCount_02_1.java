package Methods;

import java.util.Scanner;

public class VowelsCount_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        // Метой, който ми принтира броя на гласните
        printVowelsCountInAGivenString(input);

    }

    public static void printVowelsCountInAGivenString(String str) {

        int vowelsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            // boolean - ако е гласна - ми връща true
            boolean isVowel = str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A'
                    || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U';

            if (isVowel) {

                vowelsCount++;

            }

        }

        System.out.println(vowelsCount);

    }

}