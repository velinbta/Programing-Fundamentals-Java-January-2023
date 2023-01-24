package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам списък и стрингова променлива
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            // Тук си държа командата и според нея - индекси или числови променливи
            List<String> cmdList = Arrays.stream(input.split("\\s+"))
                    .collect(Collectors.toList());

            // Тя е на първо място и търся по нея:
            String command = cmdList.get(0);

            switch (command) {

                // Според командата си държа променливи
                case "Add":
                    int numberToAdd = Integer.parseInt(cmdList.get(1));
                    // Add {number}: add a number to the end of the list
                    numList.add(numberToAdd);
                    break;

                case "Remove":
                    // Remove {number}: remove a number from the list
                    int numberToRemove = Integer.parseInt(cmdList.get(1));
                    numList.removeIf(n -> n.equals(numberToRemove));
                    break;

                case "RemoveAt":
                    // RemoveAt {index}: remove a number at a given index
                    int indexToRemove = Integer.parseInt(cmdList.get(1));
                    numList.remove(indexToRemove);
                    break;

                case "Insert":
                    // Insert {number} {index}: insert a number at a given index
                    int numberToInsert = Integer.parseInt(cmdList.get(1));
                    int indexToInsert = Integer.parseInt(cmdList.get(2));
                    numList.add(indexToInsert, numberToInsert);
                    break;

            }

            input = scanner.nextLine();

        }

        numList.forEach(e -> System.out.print(e + " "));

    }

}
