package TextProcessing;

import java.util.Scanner;

public class Substring_03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String input = scanner.nextLine();

        while (input.contains(toRemove)) {

            // Замествам срещанията на toRemove в input с празен текст - нищо
            input = input.replace(toRemove, "");

        }
        // kicegiciceeb -> kgb
        System.out.println(input);

    }

}
