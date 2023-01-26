package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> threatList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        // Докато input не е "3:1"
        while (!input.equals("3:1")) {
            // Правя масив от входната променлива, от която взимам
            // командата и индексите, според нея
            String[] inputArr = input.split("\\s+");
            String command = inputArr[0];

            // Търся по командата
            switch (command) {

                case "merge":
                    int startIndex = Integer.parseInt(inputArr[1]);
                    int endIndex = Integer.parseInt(inputArr[2]);

                    // Методите връщам валидни индекси, ако те са извън границите
                    startIndex = returnValidStartIndex(threatList, startIndex);
                    endIndex = returnValidEndIndex(threatList, endIndex);

                    // Съединявам стринговете от началния до крайния индекс
                    StringBuilder addBuilder = new StringBuilder();
                    for (int i = startIndex; i <= endIndex; i++) {
                        addBuilder.append(threatList.get(i));
                    }

                    // Махам ги от началния до крайния в списъка:
                    // за да работи коректно, трябва да е от - startIndex до еndIndex + 1,
                    threatList.removeAll(threatList.subList(startIndex, endIndex + 1));
                    // а тук да е add вместо set, иначе set - затрива елемента на тази позиция
                    threatList.add(startIndex, addBuilder.toString());

                    break;

                case "divide":
                    // Получавам индекс и на колко части се дели
                    int index = Integer.parseInt(inputArr[1]);
                    int partition = Integer.parseInt(inputArr[2]);

                    if (partition <= 0) {
                        // Ако получа 0 части - пропускам
                        input = scanner.nextLine();
                        continue;
                    }

                    // Записвам индекса като String и го трия от списъка
                    String stringToDivide = threatList.get(index);
                    threatList.remove(index);

                    // Получавам дължината от индекса, който трябва да разделя / частите (int!)
                    int length = stringToDivide.length() / partition;
                    int countSubstring = 0; // От тук контролирам самата дължина подтекста

                    // Итерирам до предпоследния, за да не го включвам него
                    for (int i = 0; i < partition - 1; i++) {

                        // Започвам от 0, и всеки път увеличавам индекса
                        String subString = stringToDivide.substring(countSubstring, countSubstring + length);
                        threatList.add(index, subString);
                        index++; // увеличавам индекса
                        countSubstring += length; // също и дължината на подтекста

                    }

                    // Добавям последния, за да спазя условието, ако не се делят точно,
                    // този да е най-дълъг
                    String last = stringToDivide.substring(countSubstring);
                    threatList.add(index, last);

                    break;

            }

            input = scanner.nextLine();

        }

        threatList.forEach(e -> System.out.print(e + " "));

    }

    private static int returnValidStartIndex(List<String> threatList, int startIndex) {

        if (startIndex < 0 || startIndex > threatList.size() - 1) {
            startIndex = 0;
        }

        return startIndex;
    }

    private static int returnValidEndIndex(List<String> threatList, int endIndex) {

        if (endIndex > threatList.size() - 1 || endIndex < 0) {
            endIndex = threatList.size() - 1;
        }

        return endIndex;
    }

}

