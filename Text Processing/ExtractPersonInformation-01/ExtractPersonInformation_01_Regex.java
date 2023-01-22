package TextProcessingMoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation_01_Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Броя на редовете
        int lines = Integer.parseInt(scanner.nextLine());
        // Регулярни изрази да името и за възрастта
        String nameRegex = "@(?<name>[A-Za-z]+)\\|";
        String ageRegex = "#(?<age>\\d+)\\*";

        for (int i = 0; i < lines; i++) {

            String info = scanner.nextLine();

            Pattern namePattern = Pattern.compile(nameRegex);
            Matcher nameMatcher = namePattern.matcher(info);

            Pattern agePattern = Pattern.compile(ageRegex);
            Matcher ageMatcher = agePattern.matcher(info);

            // Ако намери и име и възраст по Regex описан по-горе
            if (nameMatcher.find() && ageMatcher.find()) {

                // Извличам името и възрастта, принтирам
                String name = nameMatcher.group("name");
                String age = ageMatcher.group("age");
                System.out.printf("%s is %s years old.\n", name, age);

            }

        }


    }
}
