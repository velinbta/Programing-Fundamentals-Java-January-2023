package AssiciativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам String масив, оставам само думите с четна дължина и принтирам
        String[] wordsArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(w -> w.length() % 2 == 0).toArray(String[]::new);

        Arrays.stream(wordsArr).forEach(e -> System.out.println(e));

    }

}
