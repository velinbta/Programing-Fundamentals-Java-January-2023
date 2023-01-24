package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам списък и стрингова променлива
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            // Тук държа комадата и променливата според нея, като командата е на първо място
            List<String> cmdList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
            String command = cmdList.get(0);

            switch (command) {

                case "Contains":
                    // Проверявам дали, числото се съдържа или не
                    int numberToContain = Integer.parseInt(cmdList.get(1));
                    if (numList.contains(numberToContain)) {

                        System.out.println("Yes");

                    } else {

                        System.out.println("No such number");

                    }
                    break;

                case "Print":
                    // Принтирам или четните, или нечетните числа според променливата:
                    String evenOrOdd = cmdList.get(1);

                    for (int current : numList) {
                        // четни числа
                        if (evenOrOdd.equals("even")) {

                            if (current % 2 == 0) {
                                System.out.print(current + " ");
                            }
                        // нечетни числа
                        } else if (evenOrOdd.equals("odd")) {

                            if (current % 2 != 0) {
                                System.out.print(current + " ");
                            }

                        }

                    }

                    System.out.println();
                    break;

                case "Get":
                    // Принтирам сумата числата в списъка
                    int sum = 0;

                    for (int current : numList) {
                        sum += current;
                    }

                    System.out.println(sum);
                    break;

                case "Filter":
                    // Според условието '<', '>', ">=", "<="
                    // филтрирам числата и ги принтирам
                    String condition = cmdList.get(1);
                    int number = Integer.parseInt(cmdList.get(2));

                    // Обхождам списъка и принтирам
                    for (int current : numList) {

                        switch (condition) {

                            case "<":
                                if (current < number) {

                                    System.out.print(current + " ");

                                }
                                break;

                            case ">":
                                if (current > number) {

                                    System.out.print(current + " ");

                                }

                                break;

                            case ">=":
                                if (current >= number) {

                                    System.out.print(current + " ");

                                }
                                break;

                            case "<=":
                                if (current <= number) {

                                    System.out.print(current + " ");

                                }

                                break;

                        }

                    }

                    System.out.println();
                    break;

            }

            input = scanner.nextLine();

        }

    }
}
