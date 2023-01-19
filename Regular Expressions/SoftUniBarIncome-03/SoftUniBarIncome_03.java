package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String order = scanner.nextLine(); // Поръчки

        double totalIncome = 0.0; // Общ приход

        while (!order.equals("end of shift")) {
        // Регурярен израз за валидна поръчка
        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>" +
                "[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.\\d]*(?<price>\\d+\\.?\\d*)\\$";

        Pattern orderPattern = Pattern.compile(regex);
        Matcher orderMatcher = orderPattern.matcher(order);

        if (orderMatcher.find()) { // Ако поръчката е валидна
            String name = orderMatcher.group("name"); // Името на клиента
            String product = orderMatcher.group("product"); // продукта
            int count = Integer.parseInt(orderMatcher.group("count")); // Количество
            double price = Double.parseDouble(orderMatcher.group("price")); // Цена
            double sum = count * price; // Цена по количество
            totalIncome += sum;

            System.out.printf("%s: %s - %.2f\n",name, product, sum);

        }

            order = scanner.nextLine(); // Докато не получа "end of shift"
        }

        System.out.printf("Total income: %.2f\n", totalIncome); // Общия приход


    }
}
