package AssociativeArrays;

import java.util.*;

public class ForceBook_09_2 {
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

                boolean contains = false;
                // Обхождам стойностите, и проверявам дали в списъците на асоциативния масив
                // се съдържа потребителя
                for (List<String> currentList : sideUserMap.values()) {

                    if (currentList.contains(user)) {
                        contains = true;
                        // Ако се провери само един списък, няма да е правилна задачата!!
                        // Only if there is no such force user in any force side
                        // -> add the force user to the corresponding side.
                        break;
                    }

                }

                // Слагам страна и нов списък, ако потребителя го няма никъде слагам го и него
                sideUserMap.putIfAbsent(side, new ArrayList<>());

                if (!contains) {
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
                    currentList.removeIf(e -> e.equals(user));
                }

                sideUserMap.get(side).add(user);

                System.out.printf("%s joins the %s side!%n", user, side);

            }

            input = scanner.nextLine();

        }

        sideUserMap.entrySet().stream().filter(e -> e.getValue().size() > 0) // Ограничавам, да не принтирам празни списъци
                .forEach(entry -> { // блок от код, който искам да се изпълни за всяко едно entry
                            System.out.printf("Side: %s, Members: %d\n", entry.getKey(), entry.getValue().size());
                            entry.getValue().forEach(user -> System.out.println("! " + user));
                        }
                );

    }

}
