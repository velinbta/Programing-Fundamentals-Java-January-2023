package BasicSyntax;

import java.util.Scanner;

public class RageExpenses_11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Получавам 5 реда входни данни
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        float headsetPrice = Float.parseFloat(scanner.nextLine());
        float mousePrice = Float.parseFloat(scanner.nextLine());
        float keyboardPrice = Float.parseFloat(scanner.nextLine());
        float displayPrice = Float.parseFloat(scanner.nextLine());

        // Получавам “счупванията", като целочислено разделя броя загубени игри
        // на пътите когато си счупва оборудването:
        int headsetTrash = lostGamesCount / 2; // <- Всяка втора загубена игра
        int mouseTrash = lostGamesCount / 3; // <- Всяка трета загубена игра и т.н
        int keyboardTrash = lostGamesCount / 6;
        int displayTrash = lostGamesCount / 12;

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
