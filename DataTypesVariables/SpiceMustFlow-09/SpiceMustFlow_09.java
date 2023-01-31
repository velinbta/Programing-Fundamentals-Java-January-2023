package DataTypesVariables;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialYield = Integer.parseInt(scanner.nextLine());

        int finalProduction = 0;
        int daysOperate = 0;
        boolean isNotProduced = true; // <- Ако не произведат нищо, тоест първоначалния вход е под 100

        while (initialYield >= 100) {

            daysOperate++; // <- Дните, които полето работи

            isNotProduced = false;

            finalProduction = (finalProduction + initialYield) - 26; // <- Всеки ден работниците консумират по 26
            initialYield -= 10; // <- Всеки ден първоначалното производство намалява с 10

        }

        if (isNotProduced) {

            // Тук въпроса, е че ако не са произвели нещо, не ядат !!!!
            System.out.println(daysOperate);
            System.out.println(finalProduction);

        } else {

            // Когато има някакво производство
            finalProduction -= 26; // <- Накрая консумират още 26
            System.out.println(daysOperate);
            System.out.println(finalProduction);

        }

    }

}
