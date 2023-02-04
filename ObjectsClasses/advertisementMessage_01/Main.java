package advertisementMessage_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine()); // <- Брой съобщения

        for (int i = 0; i < lines; i++) {

            Message currentMessage = new Message(); // <- Нов обект от класа Message

            System.out.println(currentMessage.toString()); // <- @Override на .toString()

        }

    }

}
