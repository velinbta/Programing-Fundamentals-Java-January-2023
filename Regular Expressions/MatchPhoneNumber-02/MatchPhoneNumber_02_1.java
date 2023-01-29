package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // Регурярният израз, по който ще ми търси в получения текст
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern phonePattern = Pattern.compile(regex);
        Matcher phoneMatcher = phonePattern.matcher(text);

        List<String> phoneList = new ArrayList<>();
        // Ако намери, ги добавям в списък
        while (phoneMatcher.find()) {

            phoneList.add(phoneMatcher.group());

        }

        System.out.print(phoneList.toString().replaceAll("[\\[\\]]", ""));

    }

}
