package DataTypesVariables;

import java.util.Scanner;

public class Elevator_03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получавам хората и капацитета
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        // Цялото изчисление се каства към int променлива, за Math.ceil ми трябва double - каст
        int courses = (int) Math.ceil((double) people / capacity);

        System.out.println(courses);

    }

}
