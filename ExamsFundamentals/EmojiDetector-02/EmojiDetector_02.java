package ExamsFundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Извеждам само цифрите от входните данни в списък
        List<Integer> digitList = new ArrayList<>();

        String digitRegex = "(?<digit>[\\-+]?\\d)";
        Pattern digitPattern = Pattern.compile(digitRegex);
        Matcher digitMatcher = digitPattern.matcher(input);

        while (digitMatcher.find()) {
            digitList.add(Integer.parseInt(digitMatcher.group("digit")));
        }

        // Умножавам всички цифри в масива и намирам "прага на готиност"
        long coolThreshold = getCoolThresholdByMultiplyingDigitsInArr(digitList);

        List<String> validEmojiList = getValidEmojiFromText(input); // <- Всички валидни емотикони

        List<String> coolEmojiList = getOnlyTheCoolEmojisBySummingASCIISymbolsOfEachValidEmojiAndCompare
                (validEmojiList, coolThreshold); // <- Всички валидни, който са с по-голям праг на "готиност"

        System.out.printf("Cool threshold: %d\n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n", validEmojiList.size());
        coolEmojiList.forEach(emoji -> System.out.println(emoji));

    }

    private static long getCoolThresholdByMultiplyingDigitsInArr(List<Integer> digitsArr) {
        // Умножава всички цифри в списъка
        long result = 1L;
        for (int digit : digitsArr)

            result *= digit;

        return result;
    }

    private static List<String> getValidEmojiFromText(String input) {
        // Намира валидните емотикони в текста
        List<String> validEmojiList = new ArrayList<>();

        String emojiRegex = "(?<emoji>([:]{2}|[*]{2})(?<name>[A-Z][a-z]{2,})\\2)";
        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(input);

        while (emojiMatcher.find()) {
            validEmojiList.add(emojiMatcher.group("emoji"));
        }

        return validEmojiList;
    }

    private static List<String> getOnlyTheCoolEmojisBySummingASCIISymbolsOfEachValidEmojiAndCompare
            (List<String> validEmoji, long coolThreshold) {
        // Намира готините - събира всяка ASCII стойност на емотикона, без обкръжаващите ги ::/**
        List<String> coolEmojiList = new ArrayList<>();

        for (String emoji : validEmoji) {

            String lettersOnly = emoji.replaceAll("\\W", ""); // <- Само буквите

            long currentCoolness = 0L; // <- ASCII стойността се събира
            for (char letter : lettersOnly.toCharArray())
                currentCoolness += letter;

            if (currentCoolness > coolThreshold) // <- Проверява се дали е "готин"
                coolEmojiList.add(emoji);

        }

        return coolEmojiList;

    }

}
