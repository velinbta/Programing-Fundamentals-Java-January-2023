package ExamsFundamentals;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Примерни: |Milk|05/09/20|2000| или #Bread#19/03/21#4000#
        String regex = "([|#])(?<product>[a-zA-Z ]+)\\1(?<date>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> productList = new ArrayList<>(); // <- Продукт
        List<String> expirationDateList = new ArrayList<>(); // <- Срок на годност
        List<Integer> caloriesList = new ArrayList<>(); // <- Калории

        while (matcher.find()) {

            // Отделям ги и ги добавям по списъците
            String product = matcher.group("product");
            String expirationDate = matcher.group("date");
            int nutrition = Integer.parseInt(matcher.group("calories"));

            productList.add(product);
            expirationDateList.add(expirationDate);
            caloriesList.add(nutrition);

        }

        long totalCalories = caloriesList.stream().mapToLong(n -> n).sum(); // <- Общо калории от всички продукти
        long totalDays = totalCalories / 2000; // <- 2000 трябват всеки ден

        System.out.printf("You have food to last you for: %d days!\n", totalDays);

        for (int i = 0; i < productList.size(); i++) {

            System.out.printf("Item: %s, Best before: %s, Nutrition: %d\n"
                    , productList.get(i), expirationDateList.get(i), caloriesList.get(i));

        }

    }

}
