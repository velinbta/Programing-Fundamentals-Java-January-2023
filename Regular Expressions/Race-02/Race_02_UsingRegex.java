package RegularExpressionsExercises;

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

        String[] namesArr = new String[3];
        // Използвам метод, който ми намира състезателя с най-много км, и му взимам името
        // След което състезателя се премехва и по този начин намерим следващия с най-много км
        namesArr[0] = getNameBasedOnGreatestValue(nameKmMap);
        namesArr[1] = getNameBasedOnGreatestValue(nameKmMap);
        namesArr[2] = getNameBasedOnGreatestValue(nameKmMap);

        System.out.printf("1st place: %s%n", namesArr[0]);
        System.out.printf("2nd place: %s%n", namesArr[1]);
        System.out.printf("3rd place: %s%n", namesArr[2]);


    }

    private static String getNameBasedOnGreatestValue(LinkedHashMap<String, Integer> nameKmMap) {

        String value = "";
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry: nameKmMap.entrySet()) {

              if (entry.getValue() > max) {
                  value = entry.getKey();
                  max = entry.getValue();
              }

        }
        nameKmMap.remove(value);

        return value;
    }


}
