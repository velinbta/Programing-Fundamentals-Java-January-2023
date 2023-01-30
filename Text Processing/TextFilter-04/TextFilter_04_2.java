package TextProcessing;

import java.util.Scanner;

public class TextFilter_04_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsToReplaceArr = scanner.nextLine().split(",\\s*");
        String text = scanner.nextLine();

        // Обхождам дължината на масива
        for (String currentWord : wordsToReplaceArr) {
            // Запаметявам в променлива символа, повторен колкото дължината на думата
            String repeatedSymbol = "*" .repeat(currentWord.length());

            // Заменям всички срещания в текста с новата променлива
            text = text.replace(currentWord, repeatedSymbol);

        }

        System.out.println(text);

    }

}
