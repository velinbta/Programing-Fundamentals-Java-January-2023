package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Orders_04 {

    static class Product {
        private String name;
        private double price;
        private int quantity;

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getName() {
            return this.name;
        }

        public double getPrice() {
            return this.price;
        }

        public int getQuantity() {
            return this.quantity;
        }


    }


    public static void main(String[] args) {
        // Създавам нов клас "Product"
        Scanner scanner = new Scanner(System.in);
        // "{name} {price} {quantity}".
        String input = scanner.nextLine();

        // Map ще ми съдържа името на продукта и неговите характеристики
        LinkedHashMap<String, Product> productAvgMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            // Разделям входа на части
            String[] productArr = input.split("\\s+");
            String name = productArr[0];
            double price = Double.parseDouble(productArr[1]);
            int quantity = Integer.parseInt(productArr[2]);

            productAvgMap.putIfAbsent(name, new Product()); // <- Слагам име и нов продукт ако липсва
            productAvgMap.get(name).setName(name); // <- Задавам име и на класа Product

            // На цената, по условие, всеки път щом срещна нова я презаписвам върху старата
            productAvgMap.get(name).setPrice(price);

            // Ако е един и същ продукт ги събирам, за да може после да умножа количество и цена
            productAvgMap.get(name).setQuantity(productAvgMap.get(name).getQuantity() + quantity);

            input = scanner.nextLine();

        }


        for (Product current : productAvgMap.values()) { // <- обхождам стойностите - класа "Product"

            double product = current.getPrice() * current.getQuantity(); // <- цена по количество
            System.out.printf("%s -> %.2f%n", current.getName(), product);

        }

    }

}

