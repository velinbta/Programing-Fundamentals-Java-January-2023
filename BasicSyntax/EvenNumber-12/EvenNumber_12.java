package BasicSyntax;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        // Докато числото е нечетно, прочитам ново
        while (number % 2 != 0) {

            System.out.println("Please write an even number.");

            number = Integer.parseInt(scanner.nextLine());
        }

        // Абсолютната стойност на четното число
        int absoluteValue = Math.abs(number);
        System.out.printf("The number is: %d%n", absoluteValue);

    }

}
