package AssociativeArrays;

import java.util.*;

public class StudentAcademy_07_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        // Map - студенти и списък с оценки
        LinkedHashMap<String, List<String>> studentGradeMap = new LinkedHashMap<>();

        for (int i = 0; i < lines; i++) {

            String name = scanner.nextLine();
            String grade = scanner.nextLine(); // <- Мога да я прочета като String, защото после ще я парсна

            // Добавям студента и неговата оценка
            studentGradeMap.putIfAbsent(name, new ArrayList<>());
            studentGradeMap.get(name).add(grade);

        }

        studentGradeMap.entrySet().forEach(entry -> {
            // Намирам на всеки списък средната оценка на студента
            double avg = entry.getValue().stream().mapToDouble(e -> Double.parseDouble(e)).average().orElse(0);

            if (avg >= 4.50) { // <- принтирам само ако е 4.50 нагоре
                System.out.printf("%s -> %.2f\n", entry.getKey(), avg);
            }

        });

    }

}
