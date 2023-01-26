package Methods;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам ширина и дължина
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        // Методът ми връща ширината и дължината умножени
        double area = getRectangleArea(width, length);

        System.out.printf("%.0f", area);

    }

    private static double getRectangleArea(double width, double length) {

        return width * length;
        
    }

}
