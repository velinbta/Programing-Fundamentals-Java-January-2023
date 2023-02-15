package ExamsFundamentals;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energyTotal = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int wonBattles = 0;
        boolean hasEnergyLeft = true;
        while (!command.equals("End of battle")) {

            int distance = Integer.parseInt(command);

            int resultOfBattle = energyTotal - distance;

            if (resultOfBattle >= 0) {

                energyTotal -= distance;
                wonBattles++;

            } else {

                hasEnergyLeft = false;
                break;

            }

            if (wonBattles % 3 == 0) {

                energyTotal += wonBattles;

            }

            command = scanner.nextLine();

        }

        if (!hasEnergyLeft) {

            System.out.printf("Not enough energy! Game ends with %d won battles and %s energy\n",
                    wonBattles, energyTotal);

        } else {

            System.out.printf("Won battles: %d. Energy left: %d\n", wonBattles, energyTotal);

        }

    }

}
