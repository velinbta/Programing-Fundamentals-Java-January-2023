package RegularExpressionsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> demonNamesList = Arrays.stream(scanner.nextLine().split("\\s*,\\s*"))
                .collect(Collectors.toList()); // Чета от конзолата списък с демон/и

        for (String demon : demonNamesList) {
            // Използвам метод да ми събере сбора на ASCII символите:
            // health се получава от сбор на символи освен - '+', '-', '*', '/' , '.' и [0-9];
            int health = getHealthByAddingChars(demon);
            // Събирам числата като взимам предвид и знаците - / +, ако има
            double summedUp = getFloatingPointsSummedUpInString(demon);
            // Според символите накрая, ги деля или умножавам по 2
            double damage = getSummedUpFloatingNumberDividedOrMultipliedBy2(demon, summedUp);

            // "{demon name} - {health points} health, {damage points} damage"
            System.out.printf("%s - %d health, %.2f damage%n", demon, health, damage);

        }


    }

    private static int getHealthByAddingChars(String demonName) {

        String demonSymbols = demonName.replaceAll("[\\d+\\-*\\/.]", "");
        int health = 0;
        for (char current : demonSymbols.toCharArray()) {

            health += current;
        }

        return health;
    }

    private static double getFloatingPointsSummedUpInString(String demonName) {
        // Регексът взима предвид и знаците плюс и минус
        Pattern floPattern = Pattern.compile("(?<digit>[-+]?\\d+\\.?\\d*)");
        Matcher floMatcher = floPattern.matcher(demonName);

        double sum = 0.0;
        while (floMatcher.find()) {
            // Преобразувам ги в число и ги събирам / изваждам
            double num = Double.parseDouble(floMatcher.group("digit"));
            sum += num;

        }

        return sum;
    }

    private static double getSummedUpFloatingNumberDividedOrMultipliedBy2 (String demonName, double summedUp) {

        double damage = summedUp;
        // Според символите накрая, деля или умножавам на 2
        for (char current: demonName.toCharArray()) {

            if (current == '*') {
                damage *= 2;
            } else if (current == '/') {
               damage /= 2;
            }

        }

        return damage;
    }



}