package DataTypesVariables;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // <- Първоначален скенер

        String data = scanner.nextLine();

        while (!data.equals("END")) {

            Scanner readDataScanner = new Scanner(data); // <- Скенер, да чете от "data"

            if (readDataScanner.hasNextInt()) { // <- Ако може да го парсне към int

                System.out.printf("%s is integer type\n", data);

            } else if (readDataScanner.hasNextDouble()) { // <- Ако може да го парсне към double

                System.out.printf("%s is floating point type\n", data);

            } else if (readDataScanner.hasNextBoolean()) { // <- Ако може да го парсне към boolean

                System.out.printf("%s is boolean type\n", data);

            } else if (data.length() == 1) { // <- Ако дължината е 1 и не е число (проверката за int e преди тази)

                System.out.printf("%s is character type\n", data);

            } else { // <- Всички други случай

                System.out.printf("%s is string type\n", data);

            }

            data = scanner.nextLine();

        }

    }

}
