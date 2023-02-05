package students20_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // <- first name, last name, age, hometown

        List<Student> studentList = new ArrayList<>(); // <- Правя списък от класа Student

        while (!input.equals("end")) {

            // Взимам частите от входните данни
            String[] inputArr = input.split("\\s+");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            int age = Integer.parseInt(inputArr[2]);
            String hometown = inputArr[3];

            // Правя обект от класа Student и добавям в списъка
            Student currentStudent = new Student(firstName, lastName, age, hometown);
            studentList.add(currentStudent);

            input = scanner.nextLine();

        }

        String hometownInput = scanner.nextLine();

        // Правя нов списък, в който филтрирам само тези от посочения град,
        // като методът ми преди това премахва първото срещане на студенти - с еднакво първо и второ име
        List<Student> filteredList = getListFilteredFirstAndSecondNameUnique(studentList)
                .stream().filter(student -> student.getHometown().equals(hometownInput)).collect(Collectors.toList());

        filteredList.forEach(student -> System.out.printf("%s %s is %d years old%n"
                , student.getFirstName(), student.getLastName(), student.getAge()));


    }

    private static List<Student> getListFilteredFirstAndSecondNameUnique(List<Student> studentsList) {

        // Остава студентите с уникални първи и втори имена, като премахва първото срещане
        for (int i = 0; i < studentsList.size() - 1; i++) {

            Student current = studentsList.get(i); // <- Текущ
            Student next = studentsList.get(i + 1); // <- Следващ

            if (current.getFirstName().equals(next.getFirstName())) {

                if (current.getLastName().equals(next.getLastName())) {

                    studentsList.remove(i);
                    i -= 1;

                }

            }

        }

        return studentsList;

    }

}
