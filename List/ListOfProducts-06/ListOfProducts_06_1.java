package ListLab;

import java.util.*;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам броя редове и добавям продуктите в списъка
        int lines = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < lines; i++) {

            products.add(scanner.nextLine());

        }
        // Сортирам ги по име
        Collections.sort(products);

        int i = 1;
        // Принтирам ги с номер отпред
        for (String product: products) {

            System.out.printf("%d.%s%n", i, product);
            i++;

        }

    }

}
