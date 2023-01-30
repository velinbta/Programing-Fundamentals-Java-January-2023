package BasicSyntax;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();  // Weekday   Weekend   Holiday
        short age = Short.parseShort(scanner.nextLine());

        // Методът търси по деня от седмицата и задавам нова стойност на цената
        // Ако възрастовата група не фигурира цената остава 0 и се принтира "Error!"
        byte price = getPriceDependingOnTheDay(typeOfDay, age);

        if (price != 0) {

            System.out.printf("%d$%n", price);

        } else {

            System.out.println("Error!");

        }

    }

    private static byte getPriceDependingOnTheDay(String typeOfDay, short age) {

        byte price = 0;
        switch (typeOfDay) {
            case "Weekday":
                if (age >= 0 && age <= 18) {

                    price = 12;

                } else if (age > 18 && age <= 64) {

                    price = 18;

                } else if (age > 64 && age <= 122) {

                    price = 12;

                }

                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {

                    price = 15;

                } else if (age > 18 && age <= 64) {

                    price = 20;

                } else if (age > 64 && age <= 122) {

                    price = 15;

                }

                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {

                    price = 5;

                } else if (age > 18 && age <= 64) {

                    price = 12;

                } else if (age > 64 && age <= 122) {

                    price = 10;


                }

                break;

        }

        return price;

    }

}
