package AssociativeArrays;

import java.util.*;

public class ForceBook_09_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> sideUserMap = new LinkedHashMap<>();
        // String = sides , List<String> = users
        while (!input.equals("Lumpawaroo")) { // <- Докато input не стане "Lumpawaroo"

            if (input.contains("|")) {
                // Взимам частите на входа: side на 0, user на 1
                String[] inputArr = input.split(" \\| ");
                String side = inputArr[0];
                String user = inputArr[1];

                sideUserMap.putIfAbsent(side, new ArrayList<>());

                boolean contains = false;
                // Обхождам стойностите, и проверявам дали в списъците на асоциативния масив
                // се съдържа потребителя
                for (List<String> current : sideUserMap.values()) {

                    if (current.contains(user)) {
                        contains = true;
                        // Ако се провери само един списък, няма да е правилна задачата!!
                        // Only if there is no such force user in any force side
                        // -> add the force user to the corresponding side.
                        break;
                    }

                }

                if (!contains) {
                    // Само, ако потребителя го няма никъде го добавям
                    sideUserMap.get(side).add(user);
                }

            } else if (input.contains("->")) {
                // Взимам частите на входа: user на 0, side на 1
                String[] inputArr = input.split(" -> ");
                String user = inputArr[0];
                String side = inputArr[1];

                // Слагам нова страна, ако не съществува
                sideUserMap.putIfAbsent(side, new ArrayList<>());

                // Ако в стойностите на асоциативния масив се съдържа текущият user - го премахвам
                for (List<String> currentList : sideUserMap.values()) {
                    currentList.remove(user);
                }

                sideUserMap.get(side).add(user);

                System.out.printf("%s joins the %s side!\n", user, side);

            }

            input = scanner.nextLine();

        }

        for (Map.Entry<String, List<String>> entry : sideUserMap.entrySet()) {

            if (entry.getValue().size() != 0) {// <- Ако размера на списъка не е 0 тоест не е празен

                System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());

                for (String current : entry.getValue()) {

                    System.out.printf("! %s\n", current);

                }

            }

        }

    }

}

