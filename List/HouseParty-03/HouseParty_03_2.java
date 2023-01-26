package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ще съхраня гостите, който ще идват в списък
        int guests = Integer.parseInt(scanner.nextLine());
        List<String> goingGuestsList = new ArrayList<>();

        for (int i = 0; i < guests; i++) {
            // Прочитам входа и си взимам името - то е на позиция 0
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];

            // Ако от входа, не се съдържа думата "not" и в
            // goingGuestsList гостът го няма - добавям
            if (!input.contains("not")) {

                if (goingGuestsList.contains(name)) {

                    // Ако госта го има принтирам, че е вече в списъка
                    // и преминавам на следващата итерация
                    System.out.printf("%s is already in the list!%n", name);
                    continue;

                }

                goingGuestsList.add(name);

                // Ако в input има думата "not"
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
