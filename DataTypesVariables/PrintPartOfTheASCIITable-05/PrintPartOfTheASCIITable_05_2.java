package DataTypesVariables;

import java.util.Scanner;

public class PrintPartOfTheASCIITable_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int indexStart = Integer.parseInt(scanner.nextLine()); // <- Начален
        int indexEnd = Integer.parseInt(scanner.nextLine()); // <- Краен

        if (indexStart <= indexEnd) { // Ако indexStart е по-малък -> пр. от 60 до 65

            for (char i = (char) (indexStart); i <= indexEnd; i++) {

                System.out.print(i + " ");

            }

        } else { // Ако indexStart е по-голям -> пр. от 65 до 60

            for (char i = (char) (indexStart); i >= indexEnd; i--) {

                System.out.print(i + " ");

            }

        }

    }

}
