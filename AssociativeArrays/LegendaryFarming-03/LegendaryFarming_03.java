package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(); // <- Получения вход го правя на case insensitive

        LinkedHashMap<String, Integer> materialQuantityMap = new LinkedHashMap<>();
        // Главно програмата се интересува от 3 материала, добавям ги с първоначална стойност 0
        materialQuantityMap.put("shards", 0);
        materialQuantityMap.put("fragments", 0);
        materialQuantityMap.put("motes", 0);

        boolean isObtained = false;
        while (!isObtained) { // <- Докато, някой от материалите не достигне 250 и нагоре - количество

            String[] itemsArr = input.split("\\s+"); // <- Правя си масив от входа

            for (int i = 0; i < itemsArr.length; i++) {

                if (i % 2 != 0) { // <- Всяка нечетна итерация ще ми дава материали

                    String material = itemsArr[i];
                    int quantity = Integer.parseInt(itemsArr[i - 1]); // Количеството взимам от масива, предишната позиция

                    // Слагам материал, ако липсва с първоначално 0 количество
                    materialQuantityMap.putIfAbsent(material, 0);

                    // Ако срещна пак същия материал, му добавям и новото количество
                    materialQuantityMap.put(material, materialQuantityMap.get(material) + quantity);

                    // Когато някой от трите главни материала стане 250 и нагоре, приключвам програмата
                    // и изваждам - 250, понеже съм го "добил"
                    if (materialQuantityMap.get("shards") >= 250) { // <- "Shadowmourne"

                        System.out.println("Shadowmourne obtained!");
                        materialQuantityMap.put("shards", materialQuantityMap.get("shards") - 250);
                        isObtained = true;
                        break;

                    } else if (materialQuantityMap.get("fragments") >= 250) { // <- "Valanyr"

                        System.out.println("Valanyr obtained!");
                        materialQuantityMap.put("fragments", materialQuantityMap.get("fragments") - 250);
                        isObtained = true;
                        break;

                    } else if (materialQuantityMap.get("motes") >= 250) { // <- "Dragonwrath"

                        System.out.println("Dragonwrath obtained!");
                        materialQuantityMap.put("motes", materialQuantityMap.get("motes") - 250);
                        isObtained = true;
                        break;

                    }

                }

            }

            if (isObtained) {
                // Отивам към while, и без да продължавам да чета вход
                continue;
            }

            input = scanner.nextLine().toLowerCase();

        }

        for (Map.Entry<String, Integer> entry : materialQuantityMap.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

    }

}
