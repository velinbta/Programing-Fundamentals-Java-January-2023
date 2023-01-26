package TextProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numBetweenTwoLettersArr = scanner.nextLine().split("\\s+");
        // P34562Z q2576f   H456z
        // A12b s17G

        double finalResult = 0.0;
        // Обхождам целия масив
        for (String current : numBetweenTwoLettersArr) {
            // С регулярен израз намирам числото, което по условие винаги е между буквите
            String numberRegex = "\\d+";
            Pattern numberPatter = Pattern.compile(numberRegex);
            Matcher numberMatcher = numberPatter.matcher(current);
            boolean findPattern = numberMatcher.find(); // true

            char beforeLetter = current.charAt(0); // Първата буква, като char
            char afterLetter = current.charAt(current.length() - 1); // Последната, като char
            int numberBetween = Integer.parseInt(numberMatcher.group()); // "34562" -> 34562

            // Използвам метод да ми брой, позицията на beforeLetter и afterLetter в азбуката
            int positionBeforeLetter = getPositionOfACharInEnglishAlphabetInsensitive(beforeLetter);
            int positionAfterLetter = getPositionOfACharInEnglishAlphabetInsensitive(afterLetter);

            double result = 0.0;
            // Първата буква (e.g P34562Z -> P)
            if (Character.isUpperCase(beforeLetter)) {

                // Ако е с голяма буква умножавам числото (e.g 34562) по позицията
                result = (numberBetween * 1.0) / positionBeforeLetter;

            } else {

                // Ако е с малка буква деля (e.g 34562) на позицията
                result = (numberBetween * 1.0) * positionBeforeLetter;

            }

            // Последната буква (e.g P34562Z -> Z)
            if (Character.isUpperCase(afterLetter)) {

                // Ако е голяма изваждам получената позиция от азбуката
                result -= positionAfterLetter;

            } else {

                // Ако е малка - събирам
                result += positionAfterLetter;

            }

            // Добавям към крайния резултат
            finalResult += result;

        }

        System.out.printf("%.2f%n", finalResult);

    }

    public static int getPositionOfACharInEnglishAlphabetInsensitive(char letter) {
        // Правя го като toLowerCase - за да работи цикъла insensitive
        char toLowerLetter = Character.toLowerCase(letter);
        int count = 0;
        // Колкото пъти влезе включително до буквата, това е позицията в азбуката
        for (char i = 'a'; i <= toLowerLetter; i++) {

            count++;

        }

        return count;
    }

}
