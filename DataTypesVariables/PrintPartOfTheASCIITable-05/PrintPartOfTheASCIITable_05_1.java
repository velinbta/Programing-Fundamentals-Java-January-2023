package DataTypesVariables;

import java.util.Scanner;

public class PrintPartOfTheASCIITable_05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int indexStart = Integer.parseInt(scanner.nextLine()); // <- Начален
        int indexEnd = Integer.parseInt(scanner.nextLine()); // <- Краен

        if (indexStart <= indexEnd) { // Ако indexStart е по-малък -> пр. от 60 до 65

            for (int i = indexStart; i <= indexEnd; i++) {

                char currentSymbol = (char) i; // Каствам всяко i към char
                System.out.print(currentSymbol + " ");

            }

        } else {

            for (int i = indexStart; i >= indexEnd; i--) { // Ако indexStart е по-голям -> пр. от 65 до 60

                char currentSymbol = (char) (i); // Каствам всяко i към char
                System.out.print(currentSymbol + " ");

            }

        }

    }

}
