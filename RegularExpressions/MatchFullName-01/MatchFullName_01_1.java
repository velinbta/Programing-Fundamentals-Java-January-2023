package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // Регурярният израз, по който ще ми търси в получения текст
        String regex = "\\b[A-Z?][a-z]+ [A-Z?][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Докато намирам, принтирам
        while (matcher.find()) {

            System.out.print(matcher.group() + " ");

        }

    }

}
