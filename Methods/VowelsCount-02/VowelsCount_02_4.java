package MethodsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsCount_02_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        // Метод, който ми намира гласните с регекс
        printVowelsCountInText(text);


    }

    private static void printVowelsCountInText(String text) {
        // Заменям всичко, което не е гласна буква и принтирам дължината
        String regex = "[^aeouiAEOUI]";
        String length = text.replaceAll(regex, "");
        System.out.println(length.length());

    }


}
