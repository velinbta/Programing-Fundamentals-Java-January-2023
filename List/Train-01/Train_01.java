package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        // Докато не получа "end":
        while (!input.equals("end")) {

            // Държа масив от input и според командата ще си изведа пременливи
            String[] passengersArr = input.split("\\s+");

            // Ако на позиция 0 е командата “Add"
            if (passengersArr[0].equals("Add")) {

                // Добавям пътниците в края на списъка
                int addAtTheEnd = Integer.parseInt(passengersArr[1]);
                wagonList.add(addAtTheEnd);

            } else {
                // Ако не е обхождам списъка
                for (int i = 0; i < wagonList.size(); i++) {

                    int newPassengers = Integer.parseInt(passengersArr[0]); // новите пътници
                    // Получавам общия брой
                    int inTotalPassengers = newPassengers + wagonList.get(i);

                    // Ако общия брой не надхвърля капацитета или е равен,
                    // ги добавям пътниците и прекратявам цикъла
                    if (inTotalPassengers <= maxCapacity) {

                        wagonList.set(i, inTotalPassengers);
                        break;

                    }

                }

            }

            input = scanner.nextLine();
        }

        System.out.println(wagonList.toString().replaceAll("[\\[\\],]", ""));

    }

}
