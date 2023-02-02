package AssociativeArrays;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        // Ще държа компании и служители в Map
        LinkedHashMap<String, List<String>> companyUsersMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            // Разделям входа на части
            String[] inputArr = input.split(" -> ");
            String company = inputArr[0];
            String id = inputArr[1];

            // Слагам компания и нов празен списък за служители
            companyUsersMap.putIfAbsent(company, new ArrayList<>());

            // Ако такъв служител не съществува го добавям
            // Не трябва да има служители с еднакво id!
            if (!companyUsersMap.get(company).contains(id)) {

                companyUsersMap.get(company).add(id);

            }

            input = scanner.nextLine();

        }

        companyUsersMap.entrySet().forEach(entry -> {  // <- forEach за всяко entry на асоциативния масив

            System.out.printf("%s%n", entry.getKey()); // <- първо ключа
            entry.getValue().forEach(id -> System.out.printf("-- %s%n", id)); // <- forEach за всяка стойност - тя е списък

        });

    }

}
