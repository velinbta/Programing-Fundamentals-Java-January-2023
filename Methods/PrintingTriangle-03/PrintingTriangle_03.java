package Methods;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printTriangle(n); // Методът е съвкупност от 2 метода

    }

    public static void printTriangle(int n) {

        // За всяко 1 до n - се изпълнява методът - printLine
        for (int i = 1; i <= n; i++) {
            // На него съм задал, да принтира от 1 до "i" - "i" със всяка итерация се увеличава,
            // докато не достигне n
            printLine(1, i);

        }
        // Тук е същото само, че цикълът се върти наобратно и се започва от n - 1
        for (int i = n - 1; i >= 1; i--) {

            printLine(1, i);

        }

    }

    public static void printLine(int start, int end) {
        // Методът приема за параметри начало и край
        for (int i = start; i <= end; i++) {

            System.out.print(i + " ");

        }

        System.out.println();

    }

}
