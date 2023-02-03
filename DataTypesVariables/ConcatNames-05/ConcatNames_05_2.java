package DataTypesVariables;

import java.util.Scanner;

public class ConcatNames_05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам 3 String променливи и ги конкатенирам
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        StringBuilder concatBuild = new StringBuilder();
        concatBuild.append(firstName).append(delimiter).append(lastName);

        System.out.println(concatBuild);

    }

}
