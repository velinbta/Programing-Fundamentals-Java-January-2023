package BasicSyntax;

import java.util.Scanner;

public class Passed_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float grade = Float.parseFloat(scanner.nextLine());

        // Ако оценката е над 3.00, значе е преминал
        if (grade >= 3.00F) {

            System.out.println("Passed!");

        }

    }

}
