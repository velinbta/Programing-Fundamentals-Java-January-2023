package BasicSyntax;

import java.util.Scanner;

public class StudentInformation_01 {
    static class Student {
        // Клас Student: име, възраст, оценка
        String name;
        byte age;
        float grade;

        private Student(String name, byte age, float grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        private String getName() {
            return this.name;
        }

        private byte getAge() {
            return this.age;
        }

        private float getGrade() {
            return this.grade;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам входните данни
        String name = scanner.nextLine();
        byte age = Byte.parseByte(scanner.nextLine());
        float grade = Float.parseFloat(scanner.nextLine());

        // Добавям студента в създадения клас - Student и принтирам
        Student student = new Student(name, age, grade);

        String result = String.format("Name: %s, Age: %d, Grade: %.2f"
                , student.getName(), student.getAge(), student.getGrade());

        System.out.println(result);

    }

}
