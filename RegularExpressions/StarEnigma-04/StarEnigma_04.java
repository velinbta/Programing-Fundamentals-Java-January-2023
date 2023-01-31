package RegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCount = Integer.parseInt(scanner.nextLine()); // Броя на редовете за дешифриране

        List<String> planetList = new ArrayList<>(); // Съхранявам планетите в списък

        for (int i = 0; i < lineCount; i++) {

            String message = scanner.nextLine(); // Получавам съобщението
            // Използвам метод, който ми взима [s, t, a, r] - големи и малки букви, използвайки регекс
            // и получавам число, с което ще намалям всеки символ - ASCII кода на полученото съобщение

            int count = countLettersSTARstar(message);
            // Намалям, дешифрирам полученото съобщение
            String decryptedMessage = getCharsDowngradedByCountReq(message, count);
            planetList.add(decryptedMessage); // добавам в списъка

        }

        List<String> attackedList = new ArrayList<>(); // Списък с атакуваните планети
        List<String> destroyedList = new ArrayList<>(); // Списък с унищожените планети

        for (String current : planetList) {
            // PQ@Alderaa1:30000!A!->20000 - Пример
            String regex = "^[^@\\-!:>]*@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:[^@\\-!:>\\d]*" +
                    "(?<population>\\d+)[^@\\-!:>]*![^@\\-!:>]*(?<attackType>A|D)![^@\\-!:>]*->[^@\\-!:>\\d]*" +
                    "(?<soldierCount>\\d+)[^@\\-!:>]*$";
            Pattern planetPattern = Pattern.compile(regex);
            Matcher planetMatcher = planetPattern.matcher(current);

            if (planetMatcher.find()) {

                // Ако е валидно, добавям в списъци в зависимост от буквата / А / D
                String planetName = planetMatcher.group("planetName");
                String attackType = planetMatcher.group("attackType");

                if (attackType.equals("A")) {
                    attackedList.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyedList.add(planetName);
                }

            }

        }

        // Сортирам ги по азбучен ред
        Collections.sort(attackedList);
        Collections.sort(destroyedList);

        // Принтирам атакуваните и унищожени планети
        System.out.printf("Attacked planets: %d%n", attackedList.size());
        attackedList.forEach(e -> System.out.println("->" + " " + e));
        System.out.printf("Destroyed planets: %d%n", destroyedList.size());
        destroyedList.forEach(e -> System.out.println("->" + " " + e));

    }

    private static int countLettersSTARstar(String message) {
        // Преброява буквите [s, t, a, r] - големи и малки
        String lettersReq = message.replaceAll("[^STARstar]+", "");
        return lettersReq.length();
    }

    private static String getCharsDowngradedByCountReq(String message, int count) {
        // Намаля всеки от символите определен брой пъти
        StringBuilder decrypted = new StringBuilder();
        for (char current : message.toCharArray()) {

            char decryptedChar = (char) (current - count);
            decrypted.append(decryptedChar);

        }

        return decrypted.toString();

    }

}
