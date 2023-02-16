package ExamsFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine()); // <- Чакащи

        int[] liftArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isPeopleWaiting = true; // <- Дали има останали хора на опашката
        for (int i = 0; i < liftArr.length; i++) {

            while (liftArr[i] < 4) { // <- Докато елемента на индекс "i" < 4, добавям хора

                liftArr[i] = liftArr[i] + 1;
                peopleWaiting--; // <- Съответно намалям от хората

                if (peopleWaiting <= 0) { // <- Ако не останат хора на опашката

                    // Проверявам, дали същевременно лифтът е пълен
                    boolean isFull = getIfLiftIsFull(liftArr);

                    // Ако лифтът е пълен, принтирам само местата и напускам цялата програма
                    if (isFull) {

                        Arrays.stream(liftArr).forEach(e -> System.out.print(e + " "));
                        return;

                    } else { // <- Ако има свободни места

                        isPeopleWaiting = false; // <- Но не остават хора
                        break;

                    }

                }

            }

            if (!isPeopleWaiting) { // <- Прекратявам двата цикъла при false

                break;

            }

        }

        if (!isPeopleWaiting) {

            System.out.println("The lift has empty spots!");
            Arrays.stream(liftArr).forEach(e -> System.out.print(e + " "));

        } else {

            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleWaiting);
            Arrays.stream(liftArr).forEach(e -> System.out.print(e + " "));

        }


    }

    private static boolean getIfLiftIsFull(int[] liftArr) {

        // Ако някой от елементите е по-малък от 4, значи има свободни места
        for (int currentElement : liftArr) {

            if (currentElement < 4) {
                return false;
            }

        }

        return true;

    }

}
