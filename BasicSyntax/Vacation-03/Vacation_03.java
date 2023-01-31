package BasicSyntax;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();   // <- Students   Business   Regular
        String dayOfWeek = scanner.nextLine();    //  <- Friday     Saturday   Sunday

        double price = 0.0;

        switch (dayOfWeek) { // <- Търся по ден от седмицата

            // За всеки един от трите дни, трябва да се търси отделно по групите,
            // защото цените са различни!
            case "Friday": // <- Ако е петък

                if (typeOfGroup.equals("Students")) {

                    price += 8.45 * group;
                    if (group >= 30) {
                        price *= 0.85; // <- 15% отстъпка
                    }


                } else if (typeOfGroup.equals("Business")) {

                    if (group >= 100) { // <- 10 човека могат да останат безплатно
                        group -= 10;
                    }
                    price += 10.90 * group;

                } else if (typeOfGroup.equals("Regular")) {

                    price += 15 * group;
                    if (group >= 10 && group <= 20) {
                        price *= 0.95;  // <- 5% отстъпка
                    }

                }

                break;

            case "Saturday": // <- Ако е събота

                if (typeOfGroup.equals("Students")) {

                    price += 9.80 * group;
                    if (group >= 30) {
                        price *= 0.85; // <- 15% отстъпка
                    }

                } else if (typeOfGroup.equals("Business")) {

                    if (group >= 100) { // <- 10 човека могат да останат безплатно
                        group -= 10;
                    }

                    price += 15.60 * group;

                } else if (typeOfGroup.equals("Regular")) {

                    price += 20 * group;
                    if (group >= 10 && group <= 20) {
                        price *= 0.95; // <- 5% отстъпка
                    }

                }

                break;

            case "Sunday": // <- Ако е неделя

                if (typeOfGroup.equals("Students")) {

                    price += 10.46 * group;
                    if (group >= 30) {
                        price *= 0.85; // <- 15% отстъпка
                    }

                } else if (typeOfGroup.equals("Business")) {

                    if (group >= 100) { // <- 10 човека могат да останат безплатно
                        group -= 10;
                    }
                    price += 16 * group;

                } else if (typeOfGroup.equals("Regular")) {

                    price += 22.50 * group;

                    if (group >= 10 && group <= 20) {
                        price *= 0.95; // <- 5% отстъпка
                    }

                }

                break;

        }

        System.out.printf("Total price: %.2f", price);

    }

}

