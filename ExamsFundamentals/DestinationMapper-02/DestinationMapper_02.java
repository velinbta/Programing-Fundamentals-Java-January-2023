package ExamsFundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> destinationsList = new ArrayList<>();

        String regex = "([=\\/])(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        Pattern destinationPattern = Pattern.compile(regex);
        Matcher destinationMatcher = destinationPattern.matcher(input);

        while (destinationMatcher.find()) { // <- Намирам дестинациите, ако има такива

            destinationsList.add(destinationMatcher.group("destination"));

        }

        // Събирам дължините на дестинациите
        int travelPoints = getTravelPointsBySummingLengthsOfDestinationsInList(destinationsList);

        System.out.printf("Destinations: %s\n",
                destinationsList.toString().replaceAll("[\\[\\]]", ""));
        System.out.printf("Travel Points: %d\n", travelPoints);

    }

    private static int getTravelPointsBySummingLengthsOfDestinationsInList(List<String> destinationsList) {
        // Събира дължините на думите в списъка
        int travelPoints = 0;

        for (String destination : destinationsList)

            travelPoints += destination.length();


        return travelPoints;
    }

}
