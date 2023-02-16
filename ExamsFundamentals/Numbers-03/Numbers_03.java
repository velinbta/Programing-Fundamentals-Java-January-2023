package ExamsFundamentals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> initialNumbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList()); // <- Първоначален списък

        double average = initialNumbersList.stream()
                .mapToInt(e -> e).average().orElse(-1); // <- Намирам средната стойност

        // Сортирам и обръщам списъка - низходящ ред
        Collections.sort(initialNumbersList);
        Collections.reverse(initialNumbersList);

        // Филтрирам по-големите от средната стойност и оставам до 5 числа в новия списък
        List<Integer> filterList = initialNumbersList.stream().filter(e -> e > average)
                .limit(5).collect(Collectors.toList());

        if (!filterList.isEmpty()) {

            filterList.forEach(e -> System.out.print(e + " "));

        } else { // <- Ако е празен списъка, няма по-големи

            System.out.println("No");

        }

    }

}
