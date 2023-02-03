package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInAString_01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] charArr = scanner.nextLine().toCharArray(); // <- Входа, като масив от чарове

        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char current : charArr) {

            if (!Character.isWhitespace(current)) { // <- Ако не е празно място

                charCountMap.putIfAbsent(current, 0);
                charCountMap.put(current, charCountMap.get(current) + 1); // + 1 на всяко срещане

            }

        }

        charCountMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }

}
