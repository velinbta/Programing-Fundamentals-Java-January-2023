package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам входни данни, докато не станат "end"
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            // Правя StringBuilder от входнните данни и ги обръщам
            StringBuilder reverseBuild = new StringBuilder(input);
            reverseBuild.reverse();

            System.out.printf("%s = %s\n", input, reverseBuild);

            input = scanner.nextLine();

        }

    }

}

