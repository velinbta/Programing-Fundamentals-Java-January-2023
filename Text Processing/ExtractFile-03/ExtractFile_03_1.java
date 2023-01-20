package TextProcessingExercises;

import java.util.Scanner;

public class ExtractFile_03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам текста, като масив и го разделям по '\' и '.'
        String[] strArr = scanner.nextLine().split("[\\\\.]");
        // Предпоследния елемент е фейлът, а последния разширението
        String name = strArr[strArr.length - 2];
        String extension = strArr[strArr.length - 1];

        System.out.printf("File name: %s%n", name);
        System.out.printf("File extension: %s%n", extension);


    }
}
