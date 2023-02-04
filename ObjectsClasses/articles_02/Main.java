package articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // some title, some content, some author
        String initialArticle = scanner.nextLine(); // <- Първоначална статия

        // Взимам частите на първоначалната статия
        String title = initialArticle.split(",\\s+")[0];
        String content = initialArticle.split(",\\s+")[1];
        String author = initialArticle.split(",\\s+")[2];

        int lines = Integer.parseInt(scanner.nextLine());

        Article finalArticle = new Article(title, content, author); // <- Обект от класа Article

        for (int i = 0; i < lines; i++) {

            String input = scanner.nextLine();

            // Взимам команда на 0 позиция, ново съдържание на 1 позиция
            String command = input.split(": ")[0];
            String newInput = input.split(": ")[1];

            switch (command) {
                // В зависимост от командата, задавам ново състояния на обекта
                case "Edit":
                    finalArticle.setContent(newInput);
                    break;

                case "ChangeAuthor":
                    finalArticle.setAuthor(newInput);
                    break;

                case "Rename":
                    finalArticle.setTitle(newInput);
                    break;

            }

        }

        System.out.println(finalArticle.toString()); // <- Пренаписвам .toString()

    }

}
