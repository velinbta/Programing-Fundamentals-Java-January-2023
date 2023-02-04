package orderByAge_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>(); // <- Правя списък с класа Person

        while (!input.equals("End")) {

            // Взимам частите на input
            String name = input.split("\\s+")[0];
            String id = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);

            Person current = new Person(name, id, age); // <- Правя обект от класа Person

            personList.add(current); // <- Добавям в списъка

            input = scanner.nextLine();

        }

        // Подреждам списъка по годините на студентите
        personList.sort(Comparator.comparing(Person -> Person.getAge()));

        personList.forEach(person -> System.out.printf("%s with ID: %s is %d years old.%n"
                , person.getName(), person.getId(), person.getAge()));

    }


}
