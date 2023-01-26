package List;

import java.util.Scanner;

public class MergingLists_03_ArraySolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам два масива
        String[] firstArr = scanner.nextLine().split("\\s+");
        String[] secondArr = scanner.nextLine().split("\\s+");

        // Изчислявам по-късия и по-дълъг от двата и намирам дължината за третия
        int min = Math.min(firstArr.length, secondArr.length);
        int max = Math.max(firstArr.length, secondArr.length);

        String[] resultArr = new String[firstArr.length + secondArr.length];

        int resultArrPosition = 0; // Съхранявам до къде съм стигнал при итерацията
        for (int i = 0; i < min; i++) {

            // Итерирам до по-късия и презаписвам елементите от първи и втори
            resultArr[resultArrPosition] = firstArr[i];
            resultArrPosition++;
            resultArr[resultArrPosition] = secondArr[i];
            resultArrPosition++;

        }


        for (int i = min; i < max; i++) {
            // Итерирам до по-дългия и презаписвам оставащите елементи
            if (firstArr.length > secondArr.length) {

                resultArr[resultArrPosition] = firstArr[i];
                resultArrPosition++;

            } else {

                resultArr[resultArrPosition] = secondArr[i];
                resultArrPosition++;

            }

        }


        for (String current : resultArr) {

            System.out.print(current + " ");

        }


    }

}
