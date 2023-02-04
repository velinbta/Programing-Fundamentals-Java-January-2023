package students_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>(); // <- Правя списък с класа Student

        for (int i = 0; i < lines; i++) {

            String studentInfo = scanner.nextLine();
            // Взимам информацията за всеки студент
            String firstName = studentInfo.split("\\s+")[0];
            String lastName = studentInfo.split("\\s+")[1];
            double grade = Double.parseDouble(studentInfo.split("\\s+")[2]);

            // Правя обект от класа Student и добавям в списъка
            Student current = new Student(firstName, lastName, grade);

            studentList.add(current);

        }

        while (!studentList.isEmpty()) { // <- Докато списъка не се изпразни

            // Методът ми връща индекса в списъка на студента с най-висока оценка
            int currentIndex = getHighestIndexOfGradeInListOfStudent(studentList);

            // Принтирам и премахвам индекса от списъка
            System.out.printf("%s %s: %.2f%n",
                    studentList.get(currentIndex).getFirstName(),
                    studentList.get(currentIndex).getLastName(),
                    studentList.get(currentIndex).getGrade());

            studentList.remove(currentIndex);

        }

    }

    public static int getHighestIndexOfGradeInListOfStudent(List<Student> studentList){

        int index = -1;
        double min = Double.MIN_VALUE;
        for (int i = 0; i < studentList.size(); i++) {

            double currentStudentGrade = studentList.get(i).getGrade();

            if (currentStudentGrade > min) {

                min = studentList.get(i).getGrade();
                index = i;

            }

        }

    return index;

    }

}
