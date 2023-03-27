package AssociativeArrays;

import java.util.*;

public class Ranking_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам и въвеждам в HashMap, състезанията и паролите за тях
        Map<String, String> contestPasswordMap = readFromConsoleAndFillInHashMap(scanner);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> usersContestsPointsMap = new TreeMap<>();

        while (!input.equals("end of submissions")) {
            // Извличам си данните от входа
            String contest = input.split("=>")[0];
            String password = input.split("=>")[1];
            String username = input.split("=>")[2];
            int points = Integer.parseInt(input.split("=>")[3]);

            // Ако се съвпадат състезанието и паролата
            if (isContestExistingAndPasswordIsCorrectInMap(contestPasswordMap, contest, password)) {

                // Въвеждам участника и към него слагам нов HashMap с нула точки - първоначални
                usersContestsPointsMap.putIfAbsent(username, new HashMap<>());
                usersContestsPointsMap.get(username).putIfAbsent(contest, 0);

                // При по-високи получени точки се оставят най-високите, за това състезание, за този участник
                if (usersContestsPointsMap.get(username).get(contest) < points) {
                    usersContestsPointsMap.get(username).put(contest, points);
                }

            }

            input = scanner.nextLine();
        }

        // Намирам най-добрия кандидат, като сумирам и сравнявам общите точки на всички участници
        String[] bestCandidatePointsArr = getBestCandidateInMapAndSaveInArray(usersContestsPointsMap);
        System.out.printf("Best candidate is %s with total %s points.\nRanking:\n",
                bestCandidatePointsArr[0], bestCandidatePointsArr[1]);

        usersContestsPointsMap.entrySet().forEach(user -> {

            System.out.printf("%s\n", user.getKey());

            user.getValue().entrySet().stream() // <- Сортирам в низходящ ред, вътрешния HashMap
                    .sorted(Collections.reverseOrder(Comparator.comparing(points -> points.getValue())))
                    .forEach(contest -> System.out.printf("#  %s -> %d\n", contest.getKey(), contest.getValue()));

        });

    }

    private static Map<String, String> readFromConsoleAndFillInHashMap(Scanner scanner) {
        // Прочита от конзолата и въвежда в HashMap, състезанията и паролите за тях
        String input = scanner.nextLine();
        Map<String, String> contestPasswordMap = new HashMap<>();
        while (!input.equals("end of contests")) {

            String contest = input.split(":")[0];
            String password = input.split(":")[1];

            contestPasswordMap.putIfAbsent(contest, password);

            input = scanner.nextLine();
        }

        return contestPasswordMap;
    }

    private static boolean isContestExistingAndPasswordIsCorrectInMap(Map<String, String> contestPasswordMap,
                                                                      String currentContest, String currentPassword) {
        // Проверява дали HashMap-а съдържа текущото състезание и паролата за него се съвпада
        return contestPasswordMap.containsKey(currentContest)
                && contestPasswordMap.get(currentContest).equals(currentPassword);

    }

    private static String[] getBestCandidateInMapAndSaveInArray(Map<String, Map<String, Integer>>
                                                                        usersContestsPointsMap) {
        // Връща ми най-добрия кандидат на позиция [0] и общите му точки от всички състезания - [1] - в масив
        String[] bestCandidatePointsArr = new String[2];
        bestCandidatePointsArr[1] = "0"; // <- Задавам стойност, да не е null

        usersContestsPointsMap.entrySet().forEach(user -> { // <- Обикалям вътрешния Map

            String currentUser = user.getKey();
            // Сумирам всички точки на конкретния участник
            int currentPoints = user.getValue().entrySet().stream().mapToInt(n -> n.getValue()).sum();

            if (Integer.parseInt(String.valueOf(bestCandidatePointsArr[1])) < currentPoints) {
                // Презаписвам масива, ако общите точки на конкретния участник са повече
                bestCandidatePointsArr[0] = currentUser;
                bestCandidatePointsArr[1] = String.valueOf(currentPoints);

            }

        });

        return bestCandidatePointsArr;
    }

}
