package BasicSyntax;

import java.util.Scanner;

public class PassedOrFailed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float grade = Float.parseFloat(scanner.nextLine());

        // Ако оценката е над 3.00 - значе е преминал, иначе се е провалил
        if (grade >= 3.00F) {

            System.out.println("Passed!");

        } else {

            System.out.println("Failed!");

        }

    }

}
