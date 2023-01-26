package Methods;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float numInput = Float.parseFloat(scanner.nextLine());
        printGradeInWords(numInput); // Метод, който ми принтира в думи оценката

    }

    public static void printGradeInWords(float grade) {

        if (grade >= 2.00F && grade <= 2.99F) {

            System.out.println("Fail");
        } else if (grade >= 3.00F && grade <= 3.49F) {

            System.out.println("Poor");
        } else if (grade >= 3.50F && grade <= 4.49F) {

            System.out.println("Good");
        } else if (grade >= 4.50F && grade <= 5.49F) {

            System.out.println("Very good");
        } else if (grade >= 5.50F && grade <= 6.00F) {

            System.out.println("Excellent");
        }

    }

}
