package DataTypesVariables;

import java.util.Scanner;

public class CenturiesToMinutes_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        short years = (short) (centuries * 100); // <- За години е достатъчно short променлива
        double days = years * 365.2422; // <- По условие използвам 365.2422
        double hours = days * 24; // <- * 24 за дни
        double min = hours * 60; // <- * 60 за минути

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, min);

    }

}
