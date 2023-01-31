package BasicSyntax;

import java.util.Scanner;

public class Ages_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        // Методът определя типа, според възрастта
        String type = getPersonDeterminedByGivenAge(age);

        System.out.println(type);

    }

    private static String getPersonDeterminedByGivenAge(int age) {

        String typeDetermined = "";

        if (age >= 0 && age <= 2) {

            typeDetermined = "baby";

        } else if (age >= 3 && age <= 13) {

            typeDetermined = "child";

        } else if (age >= 14 && age <= 19) {

            typeDetermined = "teenager";

        } else if (age >= 20 && age <= 65) {

            typeDetermined = "adult";

        } else if (age >= 65) {

            typeDetermined = "elder";

        }

        return typeDetermined;
    }

}
