package ExamsFundamentals;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String worldStops = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {

            String[] commandArr = input.split("\\s*:\\s*");
            String command = commandArr[0];

            switch (command) {

                case "Add Stop":

                    int index = Integer.parseInt(commandArr[1]);
                    String text = commandArr[2];

                    if (index >= 0 && index <= worldStops.length()) { // <- Ако индексът е валиден

                        // Добавям на този индекс, дадения текст
                        worldStops = new StringBuilder(worldStops).insert(index, text).toString();

                    }

                    System.out.println(worldStops);

                    break;

                case "Remove Stop":

                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]) + 1; // <- inclusive

                    boolean areBothIndexesValid = startIndex >= 0 && startIndex <= worldStops.length()
                            && endIndex >= 0 && endIndex <= worldStops.length();

                    if (areBothIndexesValid) { // <- Ака са валидни и двата индекса

                        // Премахвам от началния - до крайния даден индекс
                        worldStops = new StringBuilder(worldStops).delete(startIndex, endIndex).toString();

                    }

                    System.out.println(worldStops);

                    break;

                case "Switch":

                    String oldString = commandArr[1];
                    String neuString = commandArr[2];

                    // Замествам стария с новия текст
                    worldStops = worldStops.replace(oldString, neuString);

                    System.out.println(worldStops);

                    break;

            }

            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s\n", worldStops);

    }

}
