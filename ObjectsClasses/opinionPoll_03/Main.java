package opinionPoll_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>(); // <- От създадения клас Person, правя списък

        for (int i = 0; i < lines; i++) {

            String input = scanner.nextLine();
            String name = input.split("\\s+")[0]; // <- Име на позиция 0
            int age = Integer.parseInt(input.split("\\s+")[1]); // <- Възраст на позиция 1

            Person current = new Person(name, age); // <- Обект от класа Person

            if (age > 30) { // <- Ако е над 30 го добавям в списъка

                personList.add(current);

            }

        }

        personList.forEach(e -> System.out.printf("%s - %d\n", e.getName(), e.getAge()));

    }

}
