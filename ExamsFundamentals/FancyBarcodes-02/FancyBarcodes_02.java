package ExamsFundamentals;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBarcodes = Integer.parseInt(scanner.nextLine());

        while (countBarcodes-- > 0) {

            String barcode = scanner.nextLine(); // <- Трябва да е съставен, само от валиден баркод

            Pattern barcodePattern = Pattern.compile("^@[#]+([A-Z][a-zA-Z\\d]{4,}[A-Z])@[#]+$");
            Matcher barcodeMatcher = barcodePattern.matcher(barcode);

            if (barcodeMatcher.find()) { // <- Ако съм намерил

                String productGroup = Arrays.stream(barcode.replaceAll("\\D", "")
                        .split("")).collect(Collectors.joining("")); // <- Взимам само цифрите

                String finalGroup = productGroup.length() != 0
                        ? String.format("Product group: %s", productGroup) // <- Всичките цифри, конкатенирани
                        : "Product group: 00"; // <- Ако няма цифри, default::00

                System.out.println(finalGroup);

            } else { // <- Ако не съм намерил

                System.out.println("Invalid barcode");

            }

        }

    }

}
