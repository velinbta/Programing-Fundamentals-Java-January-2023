package Methods;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printNumSign(number); // Метод, който ми притира знака на числото

    }

    public static void printNumSign(int num) {

        if (num > 0) {

            System.out.printf("The number %d is positive.", num);

        } else if (num < 0) {

            System.out.printf("The number %d is negative.", num);

        } else {

            System.out.println("The number 0 is zero.");

        }

    }

}
