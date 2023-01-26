package List;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveNegativesAndReverse_07_ArraySolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получавам числата и филтрирам да останат само положителни
        int[] numArr = Arrays // 10 -5 7 9 -33 50
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .filter(e -> e >= 0)
                .toArray();

        // Ако няма останали положителни, принтирам и прекъскам програмата
        if (numArr.length == 0) {

            System.out.println("empty");
            return;

        }

        // Тук ще съхранявам положителните числа от първия в обратен ред
        int[] secondArr = new int[numArr.length];

        int j = 0; // Променлива, за елементите от втория масив

        for (int i = numArr.length - 1; i >= 0; i--) {

            int currentElement = numArr[i]; // Текущия елемент в първия масив

            secondArr[j] = currentElement;
            j++;

        }

        for (int element : secondArr) {

            System.out.print(element + " ");

        }


    }

}
