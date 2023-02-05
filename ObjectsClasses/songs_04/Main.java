package songs_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>(); // <- Списък от клас Song

        for (int i = 0; i < lines; i++) {

            // Правя масив и взимам частите от входните данни
            String[] inputArr = scanner.nextLine().split("_"); // <- "{typeList}_{name}_{time}"
            String typeList = inputArr[0];
            String name = inputArr[1];
            String time = inputArr[2];

            // Правя обект от класа Song и го добавям в списъка
            Song currentSong = new Song(typeList, name, time);

            songList.add(currentSong);

        }

        String command = scanner.nextLine();

        if (command.equals("all")) { // <- Имената на всички песни

            songList.forEach(song -> System.out.println(song.getName()));

        } else { // <- В зависимост от подадения typeList в командата

            songList.forEach(song -> {

                if (command.equals(song.getTypeList())) {
                    System.out.println(song.getName());
                }

            });

        }

    }

}
