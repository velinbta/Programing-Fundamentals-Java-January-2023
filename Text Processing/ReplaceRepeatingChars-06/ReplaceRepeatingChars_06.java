package TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        // Обхождам дължината на текста без последния символ
        for (int i = 0; i < text.length() - 1; i++) {

            char firstSymbol = text.charAt(i);
            char secondSymbol = text.charAt(i + 1);

            // Ако се съвпадат трия символа на текуща позиция и връщам итерацията на цикъла с 1
            if (firstSymbol == secondSymbol) {

                text.deleteCharAt(i);
                i = i - 1;

            }

        }

        System.out.println(text);

    }

}
