package TextProcessing;

import java.util.Scanner;

public class HTML_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // (<h1></h1>) , (<article></article>) , (<div></div>)
        // title и content те са константни
        String title = scanner.nextLine();
        String content = scanner.nextLine();

        StringBuilder htmlBuild = new StringBuilder();
        // В StringBuilder добавям за title начало - <h1>, свалям на нов ред,
        // добавям табулация, добавям заглавието и вече на нов ред и края - </h1>, като пак свалям курсора
        htmlBuild.append("<h1>\n").append("\t").append(title).append("\n</h1>\n");

        // Правя същото за content
        htmlBuild.append("<article>\n").append("\t").append(content).append("\n</article>\n");

        String comment = scanner.nextLine();

        // За comment, докато не получа "end of comments" - добавям по същата схема
        while (!comment.equals("end of comments")) {

            htmlBuild.append("<div>\n").append("\t").append(comment).append("\n</div>\n");

            comment = scanner.nextLine();

        }

        System.out.print(htmlBuild);

    }

}
