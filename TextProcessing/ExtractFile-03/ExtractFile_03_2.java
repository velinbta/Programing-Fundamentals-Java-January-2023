package TextProcessing;

import java.util.Scanner;

public class ExtractFile_03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // C:\Internal\training-internal\Template.pptx

        String text = scanner.nextLine();
        // Взимам последните индекси на '\' и '.'
        int nameStart = text.lastIndexOf('\\');
        int extensionStart = text.lastIndexOf('.');

        //  Правя подтекст на файла от последния символ до точката
        StringBuilder name = new StringBuilder(text.substring(nameStart + 1, extensionStart));

        // От точката до края е разширението на файла
        StringBuilder extension = new StringBuilder(text.substring(extensionStart + 1));

        System.out.printf("File name: %s%n", name);
        System.out.printf("File extension: %s%n", extension);

    }

}



