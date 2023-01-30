package BasicSyntax;

import java.util.Scanner;

public class MonthPrinter_05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        // Методът ми намира месеца, или при невалиден такъв - "Error!
        String month = getMonth(number);

        System.out.printf("%s", month);

    }

    // Търся по входното число и задавам стойност на месеца
    // Ако входът е извън рамките на съществуващите месеци се задава стойнст - "Error!"
    private static String getMonth(int number) {

        String month = "";
        switch (number) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Error!";
                break;

        }

        return month;

    }

}
