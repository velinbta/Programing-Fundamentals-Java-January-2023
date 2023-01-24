package ListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ще съхраня гостите, който ще идват в списък
        int guests = Integer.parseInt(scanner.nextLine());
        List<String> goingGuestsList = new ArrayList<>();

        for (int i = 0; i < guests; i++) {
            // Протичам входа като списък и си взимам от позиция 0 името
            List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .collect(Collectors.toList());
            String name = inputList.get(0);

            // Ако от входа, не се съдържа думата "not" и в
            // goingGuestsList го няма госта - го добавям
            if (!inputList.contains("not")) {

                if (goingGuestsList.contains(name)) {

                    // Ако госта го има принтирам, че е вече в списъка
                    // и преминавам на следващата итерация
                    System.out.printf("%s is already in the list!%n", name);
                    continue;

                }

                goingGuestsList.add(name);

                // Ако има "not"
            } else {

                if (goingGuestsList.contains(name)) {

                    // Ако е в списъка го трия и преминавам на следващата итерация
                    goingGuestsList.remove(name);
                    continue;

                }

                //Ако го няма в списъка, принтирам че не е в списъка
                System.out.printf("%s is not in the list!%n", name);

            }

        }

        goingGuestsList.forEach(e -> System.out.println(e + " "));

    }

}
