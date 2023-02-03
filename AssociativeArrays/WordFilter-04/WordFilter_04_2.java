package AssiciativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter_04_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам String списък, оставам само думите с четна дължина и принтирам
        List<String> wordsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(e -> e.length() % 2 == 0).collect(Collectors.toList());

        wordsList.forEach(e -> System.out.println(e));

    }

}
