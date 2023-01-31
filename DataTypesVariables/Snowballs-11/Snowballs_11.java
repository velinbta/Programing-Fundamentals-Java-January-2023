package DataTypesVariables;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snowballsProduced = Integer.parseInt(scanner.nextLine()); // <- броя на топките

        // 4 променливи ще ми съхраняват първоначалните най-ниски стойности
        double highestSnowballValue = Double.MIN_VALUE;
        int biggestSnowball = Integer.MIN_VALUE;
        int highestTime = Integer.MIN_VALUE;
        int highestQuality = Integer.MIN_VALUE;

        for (int i = 0; i < snowballsProduced; i++) {
            // Всяка топка идва с три променливи
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            // Formula -> (snowballSnow / snowballTime) ^ snowballQuality
            // Изчислявам по формула текущата стойност на топката
            double currentSnowballValue = (snowballSnow * 1.0) / snowballTime;
            currentSnowballValue = Math.pow(currentSnowballValue, snowballQuality); // <- Повдигам на степен

            // Ако текущата стойност на топката е по-голяма или равна, презаписвам четирите променливи
            if (currentSnowballValue >= highestSnowballValue) {

                highestSnowballValue = currentSnowballValue;
                biggestSnowball = snowballSnow;
                highestTime = snowballTime;
                highestQuality = snowballQuality;

            }

        }

        System.out.printf("%d : %d = %.0f (%d)\n", biggestSnowball, highestTime, highestSnowballValue, highestQuality);

    }

}
