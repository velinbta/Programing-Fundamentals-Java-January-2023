package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ">>{furniture name}<<{price}!{quantity}"
        String furniture = scanner.nextLine();

        double sumTotal = 0.0;  // Общата цена на мебелите
        List<String> furnitureList = new ArrayList<>(); // Съхранявам мебелите в списък

        while (!furniture.equals("Purchase")) {

            String regex = ">{2}(?<furnitureName>[a-zA-Z]+)<{2}(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
            Pattern furniturePattern = Pattern.compile(regex);
            Matcher furnitureMatcher = furniturePattern.matcher(furniture);

            if (furnitureMatcher.find()) {
             // Докато намира, добавям мебелите в списък и пресмятам цената - сумата по количеството
             furnitureList.add(furnitureMatcher.group("furnitureName"));
             double price = Double.parseDouble(furnitureMatcher.group("price"));
             int quantity = Integer.parseInt(furnitureMatcher.group("quantity"));
             sumTotal += price * quantity;

            }

            furniture = scanner.nextLine();
        }


        System.out.println("Bought furniture:");
        furnitureList.forEach(e -> System.out.println(e)); // Принтирам всеки мебел
        System.out.printf("Total money spend: %.2f%n", sumTotal); // Общата цена

    }
}
