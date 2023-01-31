package BasicSyntax;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double totalCoins = 0.0; // <- Съхранявам общо монетите
        while (!command.equals("Start")) { // <- Докато не стане "Start"

            // Ако командата не е Start -> тя ще е стотинки
            double coins = Double.parseDouble(command);

            // Проверявам дали са валидни монетите
            boolean isInvalidCoins = coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2;
            if (isInvalidCoins) {

                System.out.printf("Cannot accept %.2f%n", coins);
                command = scanner.nextLine(); // <- Прочитам нова променлива и преминавам към следваща итерация
                continue;

            } else {
                // Ако са валидни: 0.1, 0.2, 0.5, 1, 2
                totalCoins += coins;

            }

            command = scanner.nextLine();

        }

        // Продължавам, докато командата не стане "End"
        command = scanner.nextLine();

        while (!command.equals("End")) {

            // Ако не е "End", ще е продукт
            String product = command;

            boolean isInvalidProduct = !product.equals("Nuts") && !product.equals("Water")
                    && !product.equals("Crisps") && !product.equals("Soda") && !product.equals("Coke");

            if (isInvalidProduct) {

                System.out.printf("Invalid product%n");
                command = scanner.nextLine(); // <- Прочитам нова променлива и преминавам към следваща итерация
                continue;

            }

            // Търся по продукт
            switch (product) {

                // Ако в totalCoins няма достатъчно стотинки, прочитам нова променлива
                // и преминавам към следваща итерация
                // The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
                case "Nuts":
                    if (totalCoins < 2.0) {
                        System.out.printf("Sorry, not enough money%n");
                        command = scanner.nextLine();
                        continue;
                    } else {
                        totalCoins -= 2.0;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Water":
                    if (totalCoins < 0.7) {
                        System.out.printf("Sorry, not enough money%n");
                        command = scanner.nextLine();
                        continue;
                    } else {
                        totalCoins -= 0.7;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Crisps":
                    if (totalCoins < 1.5) {
                        System.out.printf("Sorry, not enough money%n");
                        command = scanner.nextLine();
                        continue;
                    } else {
                        totalCoins -= 1.5;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Soda":
                    if (totalCoins < 0.8) {
                        System.out.printf("Sorry, not enough money%n");
                        command = scanner.nextLine();
                        continue;
                    } else {
                        totalCoins -= 0.8;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;
                case "Coke":
                    if (totalCoins < 1.0) {
                        System.out.printf("Sorry, not enough money%n");
                        command = scanner.nextLine();
                        continue;
                    } else {
                        totalCoins -= 1.0;
                        System.out.printf("Purchased %s%n", product);
                    }
                    break;

            }

            command = scanner.nextLine();

        }

        // Рестото е оставащото в totalCoins
        System.out.printf("Change: %.2f", totalCoins);

    }

}
