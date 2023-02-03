package DataTypesVariables;

import java.util.Scanner;

public class RefactorVolumeOfPyramid_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        double dul, sh, V = 0;                                       // <- Махам променливите
        System.out.print("Length: ");
        dul = Double.parseDouble(scanner.nextLine());               // <- Инициализирам всяка по отделно
        System.out.print("Width: ");
        sh = Double.parseDouble(scanner.nextLine());                // <- Инициализирам всяка по отделно
        System.out.print("Height: ");
        V = Double.parseDouble(scanner.nextLine());                // <- Инициализирам всяка по отделно
        V = (dul * sh * V) / 3;                                    // <- Правя нова променлива за обема
        System.out.printf("Pyramid Volume: %.2f", V);

*/
        // Махам променливите отначало и оставям празни редове между кода
        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());       // <- Инициализирам всяка по отделно

        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());        // <- Инициализирам всяка по отделно

        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());       // <- Инициализирам всяка по отделно

        double volume = (length * width * height) / 3;                // <- Правя нова променлива за обема

        System.out.printf("Pyramid Volume: %.2f%n", volume);          // <- Слагам нов ред, за красота

    }

}
