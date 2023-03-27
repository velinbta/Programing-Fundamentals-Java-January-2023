package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RageQuit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decodedMessage = scanner.nextLine().toUpperCase(); // <- Правя буквите главни

        StringBuilder rageMessage = new StringBuilder(); // <- Крайно съобщение

        String regex = "(?<message>\\D+(?<digit>\\d+))";
        Pattern digitsPattern = Pattern.compile(regex);
        Matcher digitsMatcher = digitsPattern.matcher(decodedMessage);

        while (digitsMatcher.find()) { // <- Намирам съобщението и колко пъти, то трябва да се повтаря

            int currentRepetitions = Integer.parseInt(digitsMatcher.group("digit"));
            String currentMessage = digitsMatcher.group("message").replaceAll("\\d+", "");

            // Повтарям текущото съобщение, броя пъти и го добавям
            rageMessage.append(currentMessage.repeat(currentRepetitions));
        }

        // Взимам само уникалните символи от крайното съобщение
        Set<Character> uniqueCharactersSet = rageMessage.toString()
                .chars().mapToObj(e -> (char) e).collect(Collectors.toSet());

        System.out.printf("Unique symbols used: %d\n%s\n", uniqueCharactersSet.size(), rageMessage);

    }

}
