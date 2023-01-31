package DataTypesVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получавам входните данни
        int pokePowerN = Integer.parseInt(scanner.nextLine()); // <- сила
        int distanceBetweenPokeTargetsM = Integer.parseInt(scanner.nextLine()); // <- разстояние
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine()); // <- фактор на умора

        // По условие се казва, че в изчислението на процентите трябва прецизност
        // Използвам BigDecimal за най-точна прецизност в сметката и получавам 50% от първоначалната сила
        BigDecimal initialValueFiftyPercentLess = BigDecimal.valueOf(pokePowerN).multiply(BigDecimal.valueOf(0.5));

        int successPokeCount = 0;

        // Взимам и силата като BigDecimal
        BigDecimal pokePowerValue = BigDecimal.valueOf(pokePowerN * 1.0);

        while (pokePowerValue.intValue() >= distanceBetweenPokeTargetsM) { // <- Стойността като int

            successPokeCount++; // <- Осъществява poke

            // Изваждам разстоянието
            pokePowerValue = pokePowerValue.subtract(BigDecimal.valueOf(distanceBetweenPokeTargetsM));

            if (initialValueFiftyPercentLess.equals(pokePowerValue)) { // <- За тук ми трябва точността

                // Осъществявам целочислено деление (по условие)
                pokePowerValue = BigDecimal.valueOf(pokePowerValue.intValue() / exhaustionFactorY);

            }

        }

        System.out.printf("%.0f%n", pokePowerValue); // <- Махам нулите на BigDecimal променливата
        System.out.printf("%d%n", successPokeCount);

    }

}
