package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
1 || |||2   3 |4   5 6 | 7 8| -3 2   1||1 2|3|4|99 77
*/
        String input = scanner.nextLine();
        // Разделям списъка по "|", филтрирам празните места и
        // ги заменям само с по едно празно между тях
        List<String> inputList = Arrays.stream(input.split("\\|"))
                .filter(e -> !e.isBlank())
                .map(e -> e.replaceAll("\\s+", " ").trim())
                .collect(Collectors.toList());

        Collections.reverse(inputList); // Обръщам реда им

        inputList.forEach(e -> System.out.print(e + " "));

    }

}
