package TextProcessingExercises;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // peter>2sis>1a>2akarate>4hexmaster
        StringBuilder text = new StringBuilder(scanner.nextLine()); // Протичам текста директно в StringBuilder

        int digit = 0; // Тук държа, колко символи ще трия от текста

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i); // текущият символ

            if (current == '>') {
                // По условие веднага след '>', следва число, затова взимам следващия символ
                // и го добавям към digit
                int digitToAdd = Character.getNumericValue(text.charAt(i + 1));
                digit += digitToAdd;
            }
            // Ако digit не ми е 0, и текущият символ не е '>'
            if (digit != 0 && current != '>') {
               // Трия символа, намалям digit и итерацията на цикъла с 1
                text.deleteCharAt(i);
                i -= 1;
                digit--;

            }

        }


        System.out.println(text);


    }
}

