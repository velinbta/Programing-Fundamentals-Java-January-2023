package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountCharsInAString_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // От конзолата прочитам списък от Character, и премахвам празните места - Whitespace
        List<Character> characterList = scanner.nextLine().chars().mapToObj(c -> (char) c)
                .filter(e -> !Character.isWhitespace(e)).collect(Collectors.toList());

        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        characterList.forEach(character -> {
            charCountMap.putIfAbsent(character, 0); // <- За всеки чар, ако го няма
            charCountMap.put(character, charCountMap.get(character) + 1); // Всяко срещане + 1
        });

        charCountMap.entrySet().forEach(entry -> System.out.printf("%c -> %d\n",entry.getKey(), entry.getValue()));

    }

}
