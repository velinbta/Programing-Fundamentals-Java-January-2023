package students_05;

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

        // Филтрирам в нов списък, само студентите от посочения град и ги принтирам
        List<Student> filterStudentsList = studentList.stream()
                .filter(student -> student.getHometown().equals(hometownInput)).collect(Collectors.toList());

        filterStudentsList.forEach(student -> {

            System.out.printf("%s %s is %d years old%n", student.getFirstName()
                    , student.getLastName(), student.getAge());

        });

    }

}
