package Methods;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитам 3 числа
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        // Методът събира първите две числа и идважда третото
        int result = getSubtractResult(first,second,third);

        System.out.println(result);

    }

    public static int getTheSumOfTwoIntegers(int a, int b) {
        // Събира първите
        return a + b;

    }

    public static int getSubtractResult(int a, int b, int c) {
        // С помоща на метода, който събира изважда третото
        return getTheSumOfTwoIntegers(a, b) - c;

    }

}


