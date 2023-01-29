package TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        String initialText = scanner.nextLine();

        // StringBuilder ще ми съхранява декриптирания текст
        StringBuilder textBuilder = new StringBuilder();
        while (!initialText.equals("find")) {

            int j = 0; // Променлива, която ще използвам за числата, от масива "numArr"
            int lengthArr = numArr.length; // Съответно до къде ще ходи променливата, преди да се нулира

            // Обхождам първоначалния текст
            for (int i = 0; i < initialText.length(); i++) {

                char currentSymbol = initialText.charAt(i);

                // Когато j достигне дължината на масива, j се нулира
                // и започва от първото число в масива
                if (j == lengthArr) {
                    j = 0;
                }

                // От всеки текущ символ изваждам съответното число вътре от масива
                int numberToSubtract = numArr[j];
                char toAdd = (char) (currentSymbol - numberToSubtract);

                j++;

                // Добавям в StringBuilder получения резултат
                textBuilder.append(toAdd);

            }

            // Добавям празно място и прочитам нов първоначален текст за декриптиране
            textBuilder.append(" ");
            initialText = scanner.nextLine();

        }

        // Полученото от StringBuilder съхранявам в масив
        String[] textToArr = textBuilder.toString().split("\\s+");

        for (int i = 0; i < textToArr.length; i++) {

            // Взимам първоначалния индекс и крайния на съкровището и го съхранявам в променлива
            int indexTreasure = textToArr[i].indexOf("&");
            int indexTreasureLast = textToArr[i].lastIndexOf("&");
            String treasureResult = textToArr[i].substring(indexTreasure + 1, indexTreasureLast);

            // Правя същото и за локацията и принтирам
            int indexLocation = textToArr[i].indexOf("<");
            int indexLocationLast = textToArr[i].indexOf(">");
            String locationResult = textToArr[i].substring(indexLocation + 1, indexLocationLast);

            System.out.printf("Found %s at %s%n", treasureResult, locationResult);

        }

    }

}
