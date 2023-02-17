package ExamsFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialQueue = Integer.parseInt(scanner.nextLine());

        int[] liftArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int peopleWaiting = initialQueue; // <- Чакащи хора
        boolean isPeopleWaiting = true; // <- Дали има останали хора на опашката
        for (int i = 0; i < liftArr.length; i++) {

            if (peopleWaiting > 0) { // <- Ако има чакащи хора

                while (liftArr[i] < 4) { // <- Докато елементът на индекс "i" < 4, добавям хора

                    liftArr[i] = liftArr[i] + 1;
                    peopleWaiting--; // <- Съответно намалям от хората

                    if (peopleWaiting <= 0) { // <- Ако не останат хора на опашката

                        isPeopleWaiting = false;
                        break;

                    }

                }

            } else { // <- Ако няма чакащи хора
                isPeopleWaiting = false;
            }

            if (!isPeopleWaiting) { // <- Прекратявам двата цикъла при false
                break;
            }

        }

        // Проверявам дали има останали места
        boolean isFull = getIfLiftIsFull(liftArr);

        if (isFull && !isPeopleWaiting) { // <- Ако е пълен и същевременно няма чакащи хора

            Arrays.stream(liftArr).forEach(e -> System.out.print(e + " "));

        } else if (!isPeopleWaiting) { // <- Ако има места, но няма хора

            System.out.println("The lift has empty spots!");
            Arrays.stream(liftArr).forEach(e -> System.out.print(e + " "));

        } else { // <- Няма места и има чакащи хора

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
