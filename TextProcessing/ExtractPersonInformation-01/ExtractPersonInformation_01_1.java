package TextProcessing;

import java.util.Scanner;

public class ExtractPersonInformation_01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        // Прочитам броя на редовете и завъртам цикъл
        for (int i = 0; i < lines; i++) {
            StringBuilder text = new StringBuilder(scanner.nextLine());

            // Взимам символа за начола на името и този за край на името,
            // както и символа за начало на възрастта и края
            int startIndexName = text.indexOf("@");
            int endIndexName = text.indexOf("|");
            int startIndexAge = text.indexOf("#");
            int endIndexAge = text.indexOf("*");

            // Правя substring на името и възрастта и принтирам
            String name = text.substring(startIndexName + 1, endIndexName);
            String age = text.substring(startIndexAge + 1, endIndexAge);
            System.out.printf("%s is %s years old.%n", name, age);

        }

    }

}
