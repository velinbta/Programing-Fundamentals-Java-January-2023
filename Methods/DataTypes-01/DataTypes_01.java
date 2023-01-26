package Methods;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получавам типа на данните на следващия ред
        String type = scanner.nextLine();

        // Търся по него:
        switch (type) {
            // По условие трябва да използваме овърлоуд на 1 метод, в случая
            // не изглежда прилежно:
            case "int":
                int integerType = Integer.parseInt(scanner.nextLine());
                System.out.println(accordingToTypeGivenMultiplyOrSurroundBy$(integerType));
                break;

            case "real":
                double doubleType = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f", accordingToTypeGivenMultiplyOrSurroundBy$(doubleType));
                break;

            case "string":
                String stringType = scanner.nextLine();
                System.out.println(accordingToTypeGivenMultiplyOrSurroundBy$(stringType));
                break;

        }

    }

    public static int accordingToTypeGivenMultiplyOrSurroundBy$(int integerType) {

        // If the data type is int, multiply the number by 2.
        integerType = integerType * 2;
        return integerType;

    }

    public static double accordingToTypeGivenMultiplyOrSurroundBy$(double doubleType) {

        // If the data type is real, multiply the number by 1.5 and format it to the second decimal point.
        doubleType = doubleType * 1.5;
        return doubleType;

    }

    public static String accordingToTypeGivenMultiplyOrSurroundBy$(String stringType) {

        // If the data type is a string, surround the input with "$".
        String result = String.format("$%s$", stringType);
        return result;

    }

}
