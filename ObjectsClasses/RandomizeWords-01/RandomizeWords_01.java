package ObjectsClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Random rdn = new Random(); // <- Извиквам класа Random

        while (!wordsList.isEmpty()) {

            int nextRnd = rdn.nextInt(wordsList.size()); // <- Взимам произволна дума от списъка

            System.out.println(wordsList.get(nextRnd));
            wordsList.remove(nextRnd); // <- Премахвам я, за да не се принтира отново

        }

    }

}
