package TextProcessingExercises;

import java.util.Scanner;

public class MultiplyBigNumber_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // По условие, не трябва да се използва BigInteger
        StringBuilder longNumber = new StringBuilder(scanner.nextLine()); // Прочитам дългото число като StringBuilder

        removeLeadingZeroes(longNumber); // Махам водещата 0, за да не е octal literal
        // Махам ако не е число, може и без тази проверка, така ще смята обаче ASCII кодовете, ако има
        removeNonDigitCharacters(longNumber);

        int singleDigit = Integer.parseInt(scanner.nextLine());

        StringBuilder buildNumber = new StringBuilder();

            int remainder = 0; // Ползвам го за 'едно на ум'
            for (int j = longNumber.length() - 1; j >= 0 ; j--) {
                // Вземам стойноста на последното число като int
                int lastDigit = Character.getNumericValue(longNumber.charAt(j));
                int result = (lastDigit * singleDigit) + remainder;

                remainder = 0; // Нулирам остатъка

                if (singleDigit == 0) {
                    // Ако числото, по което ще умножавам е 0 директно го записвам, и прекратявам
                    buildNumber.append("0");
                    break;
                }
                // Ако j е различно от 0, защото на последната итерация ще трябва да добавя остатъка
                if (j != 0) {

                    if (result > 9) { // Ако е повече от 9

                        remainder = result; // Записвам го цялото като остатък
                        // Взимам му последната цифра и я добавям
                        int digit = remainder % 10;
                        buildNumber.append(digit);
                        remainder /= 10; // Това дефакто ми е 'едно на ум'

                    } else {
                        // Ако е под 9, директно го добавям
                        buildNumber.append(result);

                    }

                } else {
                    // Ако е последна итерация
                    // Взимам му последната цифра и я добавям
                    int digit = result % 10;
                    buildNumber.append(digit);
                    int lastToAppend = result / 10; // Това е последния остатък
                    // Добавям го само, ако е различен от 0, защото числото не може да започне с 0
                    if (lastToAppend != 0) {
                        buildNumber.append(lastToAppend);
                    }

                }


            }

            buildNumber.reverse(); // Обръщам числата, защото ги .append ги поставя всички накрая


        System.out.println(buildNumber);


    }

    private static void removeLeadingZeroes (StringBuilder longNumber) {
        // Махам водещата 0
        for (int i = 0; i < longNumber.length(); i++) {
            char current = longNumber.charAt(i);

            if (current == '0') {
                longNumber.deleteCharAt(i);
                i -= 1;
            } else {
                break;
            }

        }

    }

    private static void removeNonDigitCharacters (StringBuilder longNumber) {
        // Махам, ако не е число
        for (int i = 0; i < longNumber.length(); i++) {

          char current = longNumber.charAt(i);
          if (!Character.isDigit(current)) {
              longNumber.deleteCharAt(i);
              i -= 1;

          }

        }

    }


}


