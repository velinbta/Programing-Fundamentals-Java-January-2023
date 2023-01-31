package BasicSyntax;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // За всяка поръчка се получават още 3 променливи
        int orders = Integer.parseInt(scanner.nextLine());

        double orderPrice = 0; // <- Общата цена
        for (int i = 0; i < orders; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            // Пресмятам по дадената формула и получавам цената на единичната поръчка
            // ((daysInMonth * capsulesCount) * pricePerCapsule)
            double singleOrder = (days * capsulesCount) * pricePerCapsule;

            System.out.printf("The price for the coffee is: $%.2f%n", singleOrder);

            orderPrice += singleOrder; // <- Добавям единичната към общата

        }

        System.out.printf("Total: $%.2f%n", orderPrice);

    }

}
