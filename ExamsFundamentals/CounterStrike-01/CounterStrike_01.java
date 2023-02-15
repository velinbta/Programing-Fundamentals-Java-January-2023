package ExamsFundamentals;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energyTotal = Integer.parseInt(scanner.nextLine()); // <- Общо енергия

        String command = scanner.nextLine();

        int wonBattles = 0; // <- Спечелени битки
        boolean hasEnergyLeft = true;
        while (!command.equals("End of battle")) {

            int distance = Integer.parseInt(command); // <- Дистанцията я взимам от "command"

            int resultOfBattle = energyTotal - distance;

            if (resultOfBattle >= 0) { // <- Ако е 0 или повече, се води спечелена битка

                energyTotal -= distance;
                wonBattles++;

            } else { // <- Иначе остава без енергия

                hasEnergyLeft = false;
                break;

            }

            if (wonBattles % 3 == 0) { // <- Всяка трета спечелена битка

                energyTotal += wonBattles;

            }

            command = scanner.nextLine();

        }

        if (!hasEnergyLeft) { // <- Ако не е останала енергия

            System.out.printf("Not enough energy! Game ends with %d won battles and %s energy\n",
                    wonBattles, energyTotal);

        } else { // <- Ако е останала енергия

            System.out.printf("Won battles: %d. Energy left: %d\n", wonBattles, energyTotal);

        }

    }

}
