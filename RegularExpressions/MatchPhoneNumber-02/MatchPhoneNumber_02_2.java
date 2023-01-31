package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // Регурярният израз, по който ще ми търси в получения текст
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern phonePattern = Pattern.compile(regex);
        Matcher phoneMatcher = phonePattern.matcher(text);

        StringBuilder phoneBuilder = new StringBuilder();
        // Ако намери, ще добавям в StringBuilder, заедно с запетая и разстояние
        while (phoneMatcher.find()) {

            phoneBuilder.append(phoneMatcher.group()).append(", ");

        }

        // Трия последната точка и разстояние
        int last = phoneBuilder.lastIndexOf(", ");
        phoneBuilder.replace(last, last + 2, "");

        System.out.println(phoneBuilder);

    }

}
