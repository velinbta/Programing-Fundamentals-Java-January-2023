package ExamsFundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> wordPairs = findAllWordPairsInInputSaveInList(input); // <- Намирам двойките думи

        if (wordPairs.isEmpty()) { // <- Ако няма двойки

            System.out.print("No word pairs found!\nNo mirror words!\n");

        } else {

            System.out.printf("%d word pairs found!\n", wordPairs.size());

            List<String> mirrorWords = new ArrayList<>(); // <- Еднаквите думи

            for (String pair : wordPairs) {
                // Отделям двете думи в масив
                String[] pairWordsArr = pair.replaceAll("[@#]{2}", " ")
                        .replaceAll("[@#]", "").split(" ");

                String firstWord = pairWordsArr[0];
                String secondWord = pairWordsArr[1];

                // Обръщам втората и проверявам дали са еднакви
                if (firstWord.equals(new StringBuilder(secondWord).reverse().toString())) {

                    mirrorWords.add(String.format("%s <=> %s", firstWord, secondWord));

                }

            }

            String mirrorOutput = mirrorWords.isEmpty()
                    ? "No mirror words!" // <- Ако няма еднавки
                    : String.format("The mirror words are:\n%s\n", // <- Ако има принтирам списъка с еднаквите думи
                    mirrorWords.toString().replaceAll("[\\[\\]]", ""));

            System.out.print(mirrorOutput);

        }

    }

    private static List<String> findAllWordPairsInInputSaveInList(String input) {
        // Намира всички двойки думи и ги добавя в списък - пример : @wordOne@@wordTwo@
        List<String> wordPairs = new ArrayList<>();

        String regex = "([@#])[a-zA-Z]{3,}\\1{2}[a-zA-Z]{3,}\\1";
        Pattern wordPairsPattern = Pattern.compile(regex);
        Matcher wordPairsMatcher = wordPairsPattern.matcher(input);

        while (wordPairsMatcher.find())

            wordPairs.add(wordPairsMatcher.group());

        return wordPairs;

    }

}
