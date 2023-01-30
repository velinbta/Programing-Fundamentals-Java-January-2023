package BasicSyntax;

import java.util.Scanner;

public class ForeignLanguages_06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String language = "";
        // Търся по входни данни и задавам нова стойност на променливата "language"
        switch (input) {

            case "England":
            case "USA":
                language = "English";
                break;

            case "Spain":
            case "Argentina":
            case "Mexico":
                language = "Spanish";
                break;

            default:
                language = "unknown";
                break;

        }

        System.out.println(language);

    }

}
