package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            // Правя си масив от input, който ще ми държи командата на 0 позиция
            String[] cmdArr = input.split("\\s+");
            String command = cmdArr[0];

            if (command.equals("Delete")) {
                // Премахвам, ако има такъв елемент/и
                int elementToDelete = Integer.parseInt(cmdArr[1]);
                numList.removeIf(e -> e.equals(elementToDelete));

            } else if (command.equals("Insert")) {
                // Добавям на дадената позиция елемента
                int elementToInsert = Integer.parseInt(cmdArr[1]);
                int position = Integer.parseInt(cmdArr[2]);
                numList.add(position, elementToInsert);

            }

            input = scanner.nextLine();

        }

        System.out.print(numList.toString().replaceAll("[\\[\\],]", ""));

    }

}
