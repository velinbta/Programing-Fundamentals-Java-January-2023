package DataTypesVariables;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine()); // <- Не пречи да е long
        short area = Short.parseShort(scanner.nextLine()); // <- Тук не е нужно повече от short

        String result = String.format("Town %s has population of %d and area %d square km.", town, population, area);

        System.out.println(result);

    }

}
