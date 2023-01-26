package ListExercises.AppendArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
1 || |||2   3 |4   5 6 | 7 8| -3 2   1||1 2|3|4|99 77
*/
        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList()); // разделям стойностите по "|"

        Collections.reverse(inputList); // обръщам ги

        // Правя ги на текст
        String inputText = inputList.toString().replaceAll("[\\[\\],]", "")
                .trim() // махам празни места, отляво и дясно
                .replaceAll("\\s+", " ");
        // ако има повече от едно празно място, го правя само едно

        System.out.println(inputText);

    }

}

