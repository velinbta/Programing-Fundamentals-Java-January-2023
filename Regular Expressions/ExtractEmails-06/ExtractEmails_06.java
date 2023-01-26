package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String emailText = scanner.nextLine(); // Прочитам текст, съдържащ email
        // Регурярен израз за email
        String regex = "\\b(?<user>[a-zA-Z\\d]+[\\.\\-\\_]*[a-zA-Z\\d]+)@(?<host>[a-zA-Z\\-]+\\.[a-zA-Z\\-]+\\.?[a-zA-Z\\-]*)\\b";

        List<String> emailList = new ArrayList<>();

        Pattern emailPattern = Pattern.compile(regex);
        Matcher emailMatcher = emailPattern.matcher(emailText);

        // Ако е валиден email, го добавям в списъка
        while (emailMatcher.find()) {

            emailList.add(emailMatcher.group());

        }

        // Принтирам всеки по отделно
        emailList.forEach(e -> System.out.println(e));

    }

}
