package TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ще съхранявам на различни места цифри, букви и други от получения текст
        String text = scanner.nextLine();

        // Премахвам всичко, освен цифрите и остават само те
        String digits = text.replaceAll("\\D+", "");

        // Премахвам всичко, освен буквите и остават само те
        String letters = text.replaceAll("[^A-Za-z]+", "");

        // Премахвам цифри и букви и остава всичко друго
        String other = text.replaceAll("[0-9a-zA-Z]+", "");

        System.out.printf("%s\n%s\n%s\n", digits, letters, other);

    }

}
