package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> resourceQuantityMap = new LinkedHashMap<>();

        int count = 0;
        String previousResource = ""; // <- Ресурсът от предишния ред

        while (!input.equals("stop")) {

            count++;
            if (count % 2 != 0) { // <- Нечетно дава ресурс

                resourceQuantityMap.putIfAbsent(input, 0);

            } else { // <- Четно дава количество

                // Събирам старото, ако има и новото количество
                int quantity = Integer.parseInt(input);
                resourceQuantityMap.put(previousResource, resourceQuantityMap.get(previousResource) + quantity);

            }

            previousResource = input; // <- Записвам ресурсът, за да може да слагам въз основа на него
            input = scanner.nextLine();

        }

        for (Map.Entry<String, Integer> entry : resourceQuantityMap.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }

}
