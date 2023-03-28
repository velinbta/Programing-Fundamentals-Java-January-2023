package RegularExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper_04_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decryptionKey = Integer.parseInt(scanner.nextLine()); // <- Колко пъти ще се намаля всеки символ

        String input = scanner.nextLine();

        List<String> childrenList = new ArrayList<>(); // <- Списък с послушните имена на деца
        while (!input.equals("end")) {

            // Създавам масив от чарове и издваждам от всеки чар "ключа - decryptionKey"
            Character[] decryptedCharactersArr = input.chars().mapToObj(e -> (char) e)
                    .map(e -> (char) (e - decryptionKey)).toArray(Character[]::new);

            String decryptedMessage = Arrays.toString(decryptedCharactersArr)
                    .replaceAll("[\\[\\]]", "")
                    .replaceAll(", ", ""); // <- Запазвам, ако има запетая в масива

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

}
