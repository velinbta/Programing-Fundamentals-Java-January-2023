package BasicSyntax;

import java.util.Scanner;

public class MonthPrinter_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        // Прочитам входа и създавам масив с месеци
        String[] monthArr = new String[]{
                "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"

        };

        // Изваждам 1 от числото, за да върви точно с индексацията на масива
        number -= 1;

        // Ако числото е в рамките на месеците, принтирам месеца, ако не е - "Error!"
        if (number >= 0 && number < monthArr.length) {

            String element = monthArr[number];
            System.out.println(element);

        } else {

            System.out.println("Error!");

        }

    }

}
