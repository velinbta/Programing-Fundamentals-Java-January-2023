package TextProcessing;

import java.util.Scanner;

public class TextFilter_04_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsToReplaceArr = scanner.nextLine().split(",\\s*");
        String text = scanner.nextLine();

        // Обхождам дължината на масива
        for (String currentWord : wordsToReplaceArr) {
            // Методът ми връща променлива със задеден символ, колкото дължината на подадената дума
            String toRepeat = getStringReplacedByCharByLengthSizeOfTheWordGiven(currentWord, '*');

            // Заменям всички срещания в текста с новата променлива
            text = text.replace(currentWord, toRepeat);

        }

        System.out.println(text);

    }

    private static String getStringReplacedByCharByLengthSizeOfTheWordGiven(String currentWord, char symbol) {

        StringBuilder repeatBuild = new StringBuilder();

        for (int i = 0; i < currentWord.length(); i++) {

            repeatBuild.append(symbol);

        }

        return repeatBuild.toString();

    }

}
