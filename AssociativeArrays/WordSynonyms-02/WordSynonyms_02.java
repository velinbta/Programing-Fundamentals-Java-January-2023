package AssociativeArrays;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfWordsPairs = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> wordSynonymsMap = new LinkedHashMap<>();

        for (int i = 0; i < numberOfWordsPairs; i++) {

            String word = scanner.nextLine(); // <- думата
            String synonym = scanner.nextLine(); // <- синонимът

            wordSynonymsMap.putIfAbsent(word, new ArrayList<>()); // Слагам думата, ако я няма и нов празен списък
            wordSynonymsMap.get(word).add(synonym); // Добавям синонима

        }

        for (Map.Entry<String, List<String>> entry : wordSynonymsMap.entrySet()) {

            String result = String.format("%s - %s"
                    , entry.getKey(), entry.getValue().toString().replaceAll("[\\[\\]]", ""));
            System.out.println(result);

        }

    }

}
