package DataTypesVariables;

import java.util.Scanner;

public class CharsToString_06_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам 3 char променливи и ги съединявам в StringBuilder
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        StringBuilder combinedBuild = new StringBuilder();
        combinedBuild.append(first).append(second).append(third);

        System.out.println(combinedBuild);

    }

}
