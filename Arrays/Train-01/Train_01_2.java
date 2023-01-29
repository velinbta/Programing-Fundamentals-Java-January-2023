package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short countOfWagons = Short.parseShort(scanner.nextLine()); // Брой на вагоните

        List<Short> peopleList = new ArrayList<>();

        short peopleTotal = 0;
        for (short peopleGettingOn = 0; peopleGettingOn < countOfWagons; peopleGettingOn++) {

            // Добавям тези, който се качват в списък и ги броя общо, колко са
            short peopleCount = Short.parseShort(scanner.nextLine());
            peopleTotal += peopleCount;
            peopleList.add(peopleCount);

        }

        peopleList.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println(peopleTotal);

    }

}
