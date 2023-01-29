package Arrays;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Масивът ми държи дните от седмицата
        String[] dayOfWeekArr = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        // Според input принтирам деня, като това е от масива input - 1 елемент
        short input = Short.parseShort(scanner.nextLine());

        if (input > 0 && input < 8) {

            System.out.println(dayOfWeekArr[input - 1]);

        } else {

            System.out.println("Invalid day!");

        }

    }

}
