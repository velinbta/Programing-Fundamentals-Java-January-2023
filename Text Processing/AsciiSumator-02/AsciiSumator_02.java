package TextProcessingMoreExercises;

import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам символ за начало и друг за край
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        String text = scanner.nextLine(); // Текст, между символите на който ще търся сумата от символите

        int sum = 0;

        if (start < end) { // Ако ASCII кодът на началото е по-малък от края
            // Не включвам, по условие, първият и последния символ, започвам от следващия
            for (char i = (char) (start + 1); i < end; i++) {
            // Обхождам дължината на целия текст и след това преминавам на следващия символ
                for (int j = 0; j < text.length(); j++) {
                    char current = text.charAt(j);
                    if (current == i) {
                        sum += current;
                    }

                }
            }
        } else { // Ако кодът на края е по-малък от началото
            // Тук също, започвам от следващия и свършвам без да включвам първия
            for (char i = (char) (end + 1); i < start; i++) {

                for (int j = 0; j < text.length(); j++) {
                    char current = text.charAt(j);
                    if (current == i) {
                        sum += current;
                    }

                }
            }


        }

        System.out.println(sum);

    }
}
