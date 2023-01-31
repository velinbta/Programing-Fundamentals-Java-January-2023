package TextProcessing;

import java.util.Scanner;

public class MorseCodeTranslator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам от конзолата масив и го разделям по празно място - едно или повече
        String[] morseCode = scanner.nextLine().split("\\s+");

        // Правя метод, който да ми заменя всяка една буква от морзовия код,
        // със съответната латинска такава, като на всяко "|“, слагам празно място
        changeMorseCodeToLetters(morseCode);

        // Събирам текста от масива в String и го принтирам
        String morseAsString = String.join("", morseCode);
        System.out.println(morseAsString);


    }

    private static void changeMorseCodeToLetters(String[] morseCode) {
        for (int i = 0; i < morseCode.length; i++) {
            String current = morseCode[i];
            switch (current) {
                case ".-":
                    morseCode[i] = "A";
                    break;
                case "-...":
                    morseCode[i] = "B";
                    break;
                case "-.-.":
                    morseCode[i] = "C";
                    break;
                case "-..":
                    morseCode[i] = "D";
                    break;
                case ".":
                    morseCode[i] = "E";
                    break;
                case "..-.":
                    morseCode[i] = "F";
                    break;
                case "--.":
                    morseCode[i] = "G";
                    break;
                case "....":
                    morseCode[i] = "H";
                    break;
                case "..":
                    morseCode[i] = "I";
                    break;
                case ".---":
                    morseCode[i] = "J";
                    break;
                case "-.-":
                    morseCode[i] = "K";
                    break;
                case ".-..":
                    morseCode[i] = "L";
                    break;
                case "--":
                    morseCode[i] = "M";
                    break;
                case "-.":
                    morseCode[i] = "N";
                    break;
                case "---":
                    morseCode[i] = "O";
                    break;
                case ".--.":
                    morseCode[i] = "P";
                    break;
                case "--.-":
                    morseCode[i] = "Q";
                    break;
                case ".-.":
                    morseCode[i] = "R";
                    break;
                case "...":
                    morseCode[i] = "S";
                    break;
                case "-":
                    morseCode[i] = "T";
                    break;
                case "..-":
                    morseCode[i] = "U";
                    break;
                case "...-":
                    morseCode[i] = "V";
                    break;
                case ".--":
                    morseCode[i] = "W";
                    break;
                case "-..-":
                    morseCode[i] = "X";
                    break;
                case "-.--":
                    morseCode[i] = "Y";
                    break;
                case "--..":
                    morseCode[i] = "Z";
                    break;
                case "|":
                    morseCode[i] = " ";
            }

        }

    }

}
