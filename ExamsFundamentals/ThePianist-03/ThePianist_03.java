package ExamsFundamentals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialCountPieces = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceComposerMap = new LinkedHashMap<>(); // <- пиеса/композитор
        Map<String, String> pieceKeyMap = new HashMap<>(); // <- пиеса/тоналност

        for (int i = 0; i < initialCountPieces; i++) {

            // Извличам информацията и запълвам двата Map-а
            String[] infoArr = scanner.nextLine().split("\\|");
            String piece = infoArr[0];
            String composer = infoArr[1];
            String key = infoArr[2];

            pieceComposerMap.put(piece, composer);
            pieceKeyMap.put(piece, key);

        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {

            String[] infoArr = input.split("\\|");
            String command = infoArr[0];
            String piece = infoArr[1];

            switch (command) { // <- Търся според командата

                case "Add":

                    String composer = infoArr[2];
                    String key = infoArr[3];

                    if (pieceComposerMap.containsKey(piece)) { // <- Ако пиесата се съдържа

                        System.out.printf("%s is already in the collection!\n", piece);

                    } else { // <- Ако пиесата не се съдържа

                        // Добавям пиесата и тоналността
                        pieceComposerMap.put(piece, composer);
                        pieceKeyMap.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!\n", piece, composer, key);

                    }

                    break;

                case "Remove":

                    if (pieceComposerMap.containsKey(piece)) { // <- Ако пиесата се съдържа

                        // Бива премахната
                        pieceComposerMap.remove(piece);
                        pieceKeyMap.remove(piece);
                        System.out.printf("Successfully removed %s!\n", piece);

                    } else { // <- Ако пиесата не се съдържа

                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);

                    }

                    break;

                case "ChangeKey":

                    String neuKey = infoArr[2];

                    if (pieceComposerMap.containsKey(piece)) { // <- Ако пиесата се съдържа

                        // Променям тоналността
                        pieceKeyMap.put(piece, neuKey);
                        System.out.printf("Changed the key of %s to %s!\n", piece, neuKey);

                    } else { // <- Ако пиесата не се съдържа

                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);

                    }

                    break;

            }

            input = scanner.nextLine();

        }

        pieceComposerMap.entrySet().forEach(piece ->
                System.out.printf("%s -> Composer: %s, Key: %s\n", piece.getKey(), piece.getValue(),
                        pieceKeyMap.get(piece.getKey())));

    }

}
