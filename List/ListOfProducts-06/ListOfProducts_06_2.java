package ListLab;

import java.util.Arrays;
import java.util.Scanner;

public class ListOfProducts_06_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам броя редове и ги добавям в масив
        int lines = Integer.parseInt(scanner.nextLine());
        String[] products = new String[lines];

        for (int i = 0; i < lines; i++) {

            products[i] = scanner.nextLine();

        }

        // Сортирам го по азбучен ред
        Arrays.sort(products);

        for (int i = 0; i < products.length; i++) {

            System.out.printf("%d.%s%n", i + 1, products[i]);

        }

    }
}
