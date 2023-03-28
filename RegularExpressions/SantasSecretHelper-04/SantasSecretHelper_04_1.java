package RegularExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper_04_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decryptionKey = Integer.parseInt(scanner.nextLine()); // <- Колко пъти ще се намаля всеки символ

        String input = scanner.nextLine();

        List<String> childrenList = new ArrayList<>(); // <- Списък с послушните имена на деца
        while (!input.equals("end")) {

            // Дешифрирам съобщението
            String decryptedMessage = getDecryptedMessageBySubtractingKey(input, decryptionKey);

            String regex = "@(?<name>[A-Za-z]+)[^@\\-!:>]*(!G!)"; // <- Име и !G! - добро поведение
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()) { // <- Ако намери такова дете, добавям
                childrenList.add(matcher.group("name"));
            }

            input = scanner.nextLine();

        }

        childrenList.forEach(child -> System.out.println(child));

    }

    private static String getDecryptedMessageBySubtractingKey(String decrypted, int key) {
        // Изважда определения брой "ключове“, от всеки символ и връща дешифрирания String
        char[] decryptedArr = decrypted.toCharArray();

        for (int i = 0; i < decryptedArr.length; i++) {

            char currentChar = decrypted.charAt(i);
            char decryptedChar = (char) (currentChar - key);

            decryptedArr[i] = decryptedChar;

        }

        return Arrays.toString(decryptedArr).replaceAll("[\\[\\]]", "")
                .replaceAll("(, )", ""); // <- Запазвам запетаята, ако е char!
    }

}
