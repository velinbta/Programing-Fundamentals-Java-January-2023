package MethodsExercises;

import java.util.Scanner;

public class PalindromeIntegers_09_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        //Докато командата не стане "END" чета нова
        while (!command.equals("END")) {

            // Методът ми обръща числото като стрингова променлива - наобратно
            String palNum = getStringBackwards(command);

            // Методът принтира, дали са равни или не (в случая, не връща булев резултат)
            printEqualToTheCommandOrNot(palNum, command);

            command = scanner.nextLine();

        }


    }

    public static String getStringBackwards(String command) {

        String palNum = "";
        // Въртя цикъла наобратно и съставям нов String
        for (int i = command.length() - 1; i >= 0; i--) {

            char position = command.charAt(i);

            palNum = palNum + position;

        }

        return palNum;
    }

    public static void printEqualToTheCommandOrNot(String palNum, String command) {

        // Сравнявам и принтирам true или false
        if (palNum.equals(command)) {

            System.out.println("true");

        } else {

            System.out.println("false");

        }

    }

}
