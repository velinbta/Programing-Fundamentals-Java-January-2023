package DataTypesVariables;

import java.util.Scanner;

public class Elevator_03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получавам хората и капацитета
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        // Разделям хората на капацитета, и закръглям нагоре - 5.666 -> 6
        double courses = Math.ceil((people * 1.0) / capacity);

        System.out.printf("%.0f", courses); // <- Махам всичко след десетичната точка

    }

}
