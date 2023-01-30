package BasicSyntax;

import java.util.*;

public class ForeignLanguages_06_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Map, ще ми съдържа езиците и възможните държави
        HashMap<String, List<String>> languageMap = new HashMap<>();

        languageMap.putIfAbsent("English", new ArrayList<>());
        languageMap.get("English").add("England");
        languageMap.get("English").add("USA");
        languageMap.putIfAbsent("Spanish", new ArrayList<>());
        languageMap.get("Spanish").add("Spain");
        languageMap.get("Spanish").add("Argentina");
        languageMap.get("Spanish").add("Mexico");

        boolean contains = false;
        // Ако Map съдържа държавата, принтирам говоримия език
        for (Map.Entry<String, List<String>> entry : languageMap.entrySet()) {

            for (String current : entry.getValue()) {

                if (current.contains(input)) {

                    System.out.println(entry.getKey());
                    contains = true;
                    break;

                }

            }

        }

        if (!contains) {
            // Ако държавата я няма
            System.out.println("unknown");

        }

    }

}
