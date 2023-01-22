package MethodsLab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        // Получавам продукт и го търся от следните варианти:
        switch (product) {

            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;

        }
        // Метод, който изчислява и принтира цената на продукта
        calculateAndPrintPriceOfProduct(quantity, price);

    }

    private static void calculateAndPrintPriceOfProduct(int quantity, double price) {

        double sum = price * quantity;
        System.out.printf("%.2f\n", sum);

    }

}
