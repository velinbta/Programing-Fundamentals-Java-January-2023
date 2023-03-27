package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ticketsArr = scanner.nextLine().split("\\s*,\\s*");

        for (String ticket : ticketsArr) { // <- Печеливши символи - '@', '#', '$', '^'

            if (ticket.length() != 20) { // <- Ако размера е различен от 20 - не е валиден билета

                System.out.println("invalid ticket");

            } else {

                String jackpotRegex = "([@#$^])(\\1{19})"; // <- Търся дали е джакпот
                Pattern jackpotPattern = Pattern.compile(jackpotRegex);
                Matcher jackpotMatcher = jackpotPattern.matcher(ticket);

                if (jackpotMatcher.find()) { // <- Ако е джакпот - 20 еднакви символа

                    System.out.printf("ticket \"%s\" - 10%c Jackpot!\n", ticket, ticket.charAt(0));

                } else { // <- Ако е валиден, но не е джакпот

                    String firstHalf = ticket.substring(0, 10); // <- Първа половина
                    String secondHalf = ticket.substring(10, 20); // <- Втора половина

                    String validRegex = "(?<correct>([@#$^])\\2{5,8})";
                    Pattern validPattern = Pattern.compile(validRegex);

                    // Ако и в двете половини, откривам поне 6 еднакви символа (един след друг, във всяка половина)
                    Matcher validFirstHalfMatcher = validPattern.matcher(firstHalf);
                    Matcher validSecondHalfMatcher = validPattern.matcher(secondHalf);
                    boolean isValidFound = validFirstHalfMatcher.find() && validSecondHalfMatcher.find();

                    if (isValidFound) {

                        // Взимам символите от двете групи
                        String firstValidGroup = validFirstHalfMatcher.group("correct");
                        String secondValidGroup = validSecondHalfMatcher.group("correct");

                        // Намирам минималната дължина на печелившите символи от двете групи
                        int min = Math.min(firstValidGroup.length(), secondValidGroup.length());

                        System.out.printf("ticket \"%s\" - %d%c\n", ticket, min, firstValidGroup.charAt(0));

                    } else { // <- Ако е валиден, но няма съвпадение

                        System.out.printf("ticket \"%s\" - no match\n", ticket);

                    }

                }

            }

        }

    }

}

