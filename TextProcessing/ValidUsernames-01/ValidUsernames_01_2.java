package TextProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernameArr = scanner.nextLine().split(", ");

        // Обхождам масива и проверявам дали всеки един потребител отговаря на условията
        for (String username : usernameArr) {

            // от 3 до 16 дължина, буква, цифра, тире или долна черта
            String regex = "^[\\w\\-]{3,16}$";

            Pattern usernamePattern = Pattern.compile(regex);
            Matcher usernameMatcher = usernamePattern.matcher(username);

            // Ако отговарят на условията, принтирам
            if (usernameMatcher.find()) {

                System.out.println(usernameMatcher.group());

            }

        }

    }

}
