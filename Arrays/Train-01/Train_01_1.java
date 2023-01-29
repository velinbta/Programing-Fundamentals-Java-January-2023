package Arrays;

import java.util.Scanner;

public class Train_01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonCount = Integer.parseInt(scanner.nextLine()); // Брой на вагоните

        int[] passengersArr = new int[wagonCount];

        for (int i = 0; i < passengersArr.length; i++) {

            // Добавям ги към масива
            passengersArr[i] = Integer.parseInt(scanner.nextLine());

        }

        int totalPassengers = 0;

        for (int i = 0; i < passengersArr.length; i++) {

            totalPassengers += passengersArr[i]; // Пресмятам общо, колко са
            // Принтирам всеки по отделно
            System.out.print(passengersArr[i] + " ");

        }

        // Свалям на нов ред и принтирам общо колко са
        System.out.println();
        System.out.println(totalPassengers);

    }

}
