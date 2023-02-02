package AssociativeArrays;

import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> courseStudentMap = new LinkedHashMap<>();

        while (!input.equals("end")) {
            // Взимам частите на входа и ги разделям " : "
            String[] inputArr = input.split(" : ");
            String course = inputArr[0];
            String studentName = inputArr[1];

            // Слагам нов курс, ако липсва и добавям името на студента
            courseStudentMap.putIfAbsent(course, new ArrayList<>());
            courseStudentMap.get(course).add(studentName);

            input = scanner.nextLine();

        }

        courseStudentMap.entrySet().forEach(entry -> { // <- за всяко entry на асоциативния масив

            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            entry.getValue().forEach(name -> System.out.printf("-- %s%n", name));

        });

    }

}

