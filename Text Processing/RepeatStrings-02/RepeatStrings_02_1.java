package TextProcessing;

import java.util.Scanner;

public class RepeatStrings_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        // Прочитам масив и правя StringBuilder, след това го обхождам
        StringBuilder repeatBuild = new StringBuilder();

        for (String current : inputArr) {

            // За всеки един елемент от масива, методът го връща повторен, в зависимост от дължината му
            String inputLengthRepeated = getStringRepeatedByItsLength(current);

            repeatBuild.append(inputLengthRepeated);

        }

        System.out.println(repeatBuild);

    }

    private static String getStringRepeatedByItsLength(String current) {

        StringBuilder lengthBuild = new StringBuilder();

        // Повтарям думата, колкото е дължината й
        for (int i = 0; i < current.length(); i++) {

            lengthBuild.append(current);

        }

        return lengthBuild.toString();
    }

}
