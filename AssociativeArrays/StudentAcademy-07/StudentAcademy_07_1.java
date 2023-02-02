package AssociativeArrays;

import java.util.*;

public class StudentAcademy_07_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        // Map - студенти и списък с оценки
        LinkedHashMap<String, List<Double>> studentGradeMap = new LinkedHashMap<>();

        for (int i = 0; i < lines; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            // Добавям студента и неговата оценка
            studentGradeMap.putIfAbsent(name, new ArrayList<>());
            studentGradeMap.get(name).add(grade);

        }


        for (Map.Entry<String, List<Double>> entry : studentGradeMap.entrySet()) {

            double gradesTotal = 0;
            // Обхождам и събирам оценките на студента
            for (double current : entry.getValue()) {

                gradesTotal += current;

            }

            // Изчислявам средната оценка и принтирам само тези с 4.50 и нагоре
            double average = gradesTotal / entry.getValue().size();

            if (average >= 4.50) {

                System.out.printf("%s -> %.2f%n", entry.getKey(), average);

            }

        }

    }

}
