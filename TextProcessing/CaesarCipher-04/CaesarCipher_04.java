package TextProcessing;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // В StringBuilder ще държа криптирания текст
        StringBuilder encrypt = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            // Всеки символ на текущата итерация му увеличавам
            // ASCII стойността с 3 символа напред и го добавям в StringBuilder
            char currentSymbol = text.charAt(i);
            char forwardByThree = (char) (currentSymbol + 3);
            encrypt.append(forwardByThree);

        }

        System.out.println(encrypt);

    }

}
