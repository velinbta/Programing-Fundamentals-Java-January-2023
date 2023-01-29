package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // Регурярният израз, по който ще ми търси в получения текст
        String regex = "\\b(?<firstName>[A-Z][a-z]{1,}) (?<secondName>[A-Z][a-z]{1,})\\b";

        Pattern namePattern = Pattern.compile(regex);
        Matcher nameMatcher = namePattern.matcher(text);

        // Докато намирам, принтирам
        while (nameMatcher.find()) {

            System.out.printf("%s %s "
                    , nameMatcher.group("firstName"), nameMatcher.group("secondName"));

        }

    }

}
