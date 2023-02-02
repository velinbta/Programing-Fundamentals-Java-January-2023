package AssociativeArrays;

import java.util.*;

public class StudentAcademy_07_2 {
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
        // Методът ми връща map със средни оценки на студенти 4.50 и нагоре
        LinkedHashMap<String, Double> studentAvgGradesAbove450Map = getLinkedHashMapWithStudentsAbove450Grade(studentGradeMap);

        studentAvgGradesAbove450Map.entrySet()
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    public static LinkedHashMap<String, Double> getLinkedHashMapWithStudentsAbove450Grade
            (LinkedHashMap<String, List<Double>> studentGradesMap) {

        LinkedHashMap<String, Double> studentAvgGradesMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGradesMap.entrySet()) {

            double gradesTotal = 0;
            // Обхождам и събирам оценките на студента
            for (double current : entry.getValue()) {

                gradesTotal += current;

            }
            // Изчислявам средната оценка
            double avg = gradesTotal / entry.getValue().size();

            if (avg >= 4.50) {
                // Добавям само тези с 4.50 нагоре
                studentAvgGradesMap.put(entry.getKey(), avg);

            }

        }

        return studentAvgGradesMap;

    }

}
