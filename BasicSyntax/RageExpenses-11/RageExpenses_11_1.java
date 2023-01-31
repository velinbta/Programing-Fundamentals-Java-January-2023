package BasicSyntax;

import java.util.Scanner;

public class RageExpenses_11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получавам 5 реда входни данни
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        float headsetPrice = Float.parseFloat(scanner.nextLine());
        float mousePrice = Float.parseFloat(scanner.nextLine());
        float keyboardPrice = Float.parseFloat(scanner.nextLine());
        float displayPrice = Float.parseFloat(scanner.nextLine());

        // Променливите ще ми държат броя на ударите при обхождането на изгубените игри
        int headsetTrash = 0;
        int mouseTrash = 0;
        int keyboardTrash = 0;
        int displayTrash = 0;
        for (int i = 1; i <= lostGamesCount; i++) {

            if (i % 2 == 0) {
                // Всяка втора загубена игра
                headsetTrash++;

            }

            if (i % 3 == 0) {
                // Всяка трета загубена игра
                mouseTrash++;

            }

            if (i % 2 == 0 && i % 3 == 0) {
                // Всяка шеста загубена игра
                keyboardTrash++;

                if (keyboardTrash % 2 == 0) {
                    // Всяка дванадесета игра - тук ще влезе само, ударите по клавиатурата се делят на 2
                    // Тоест - 12та поредна, 24та и т.н
                    displayTrash++;

                }

            }

        }
        // Изчислявам нанесените удари по дадените цени от входа
        float headsetTotal = headsetPrice * headsetTrash;
        float mouseTotal = mousePrice * mouseTrash;
        float keyboardTotal = keyboardPrice * keyboardTrash;
        float displayTotal = displayPrice * displayTrash;

        // Като събера всичко - получавам общата сума
        float totalAll = headsetTotal + mouseTotal + keyboardTotal + displayTotal;

        System.out.printf("Rage expenses: %.2f lv.", totalAll);

    }

}
