package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // Регурярният израз, по който ще ми търси в получения текст
        // Отделям ден, месец, година
        String regex = "\\b(?<day>\\d{2})([.\\-/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";

        Pattern datePattern = Pattern.compile(regex);
        Matcher dateMatcher = datePattern.matcher(text);

        while (dateMatcher.find()) {

            String day = dateMatcher.group("day");
            String month = dateMatcher.group("month");
            String year = dateMatcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s\n", day, month, year);

        }

    }

}

