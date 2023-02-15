package ExamsFundamentals;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfPlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0.0; // <- Общ грабеж

        for (int i = 1; i <= daysOfPlunder; i++) {

            totalPlunder += dailyPlunder; // <- Всекидневен

            if (i % 3 == 0) { // <- Всеки трети ден

                double fiftyPercentOfDailyPlunder = dailyPlunder * 0.5; // + 50% от дневния
                totalPlunder += fiftyPercentOfDailyPlunder;

            }

            if (i % 5 == 0) { // <- Всеки пети ден

                totalPlunder *= 0.7; // <- Губят 30%

            }

        }

        if (totalPlunder >= expectedPlunder) {

            System.out.printf("Ahoy! %.2f plunder gained.\n", totalPlunder);

        } else {

            double percentLeft = (totalPlunder * 100) / expectedPlunder; // <- Оставащи проценти от очакваните
            System.out.printf("Collected only %.2f%% of the plunder.", percentLeft);

        }

    }

}
