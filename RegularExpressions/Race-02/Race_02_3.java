package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racersLists = Arrays.stream(scanner.nextLine().split("\\s*,\\s*"))
                .collect(Collectors.toList()); // Получавам списък с участници

        String input = scanner.nextLine(); // Имена и километри, трябва да извлека от тук

        LinkedHashMap<String, Integer> nameKmMap = new LinkedHashMap<>(); // Съхранявам ги в Map
        racersLists.forEach(racer -> nameKmMap.putIfAbsent(racer, 0)); // Наливам състезателите
        // от списъка в Map с 0 км първоначални

        while (!input.equals("end of race")) {

            String nameRegex = "[a-zA-Z]+"; // регурярен израз за буквите
            Pattern namePattern = Pattern.compile(nameRegex);
            Matcher nameMatcher = namePattern.matcher(input);

            String digitRegex = "\\d"; // за цифрите
            Pattern digitPattern = Pattern.compile(digitRegex);
            Matcher digitMatcher = digitPattern.matcher(input);

            StringBuilder name = new StringBuilder(); // Тук получавам извлеченото име
            while (nameMatcher.find()) {

                name.append(nameMatcher.group());
            }

            int km = 0; // Тук получавам км
            while (digitMatcher.find()) {

                km += Integer.parseInt(digitMatcher.group());
            }


            if (nameKmMap.containsKey(name.toString())) { // Само, ако във вече налятия Map се съдържа името

                // Добавям допълнително км
                nameKmMap.put(name.toString(), nameKmMap.get(name.toString()) + km);
            }

            input = scanner.nextLine();

        }

        List<String> top3Players = nameKmMap.entrySet().stream() // Пускам stream по map
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                // Сортирам по стойност и обръщам реда на сортирането
                .limit(3) // Лимитирам списъка до 3
                .map(entry -> entry.getKey()) // Взимам ключа
                .collect(Collectors.toList()); // Събирам полученото в списък

        // Принтирам първите трима
        System.out.println("1st place: " + top3Players.get(0));
        System.out.println("2nd place: " + top3Players.get(1));
        System.out.println("3rd place: " + top3Players.get(2));

    }

}