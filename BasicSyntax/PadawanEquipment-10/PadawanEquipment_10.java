package BasicSyntax;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитам входните данни - 5 реда
        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double singleLightsaberPrice = Double.parseDouble(scanner.nextLine());
        double singleRobePrice = Double.parseDouble(scanner.nextLine());
        double singleBeltPrice = Double.parseDouble(scanner.nextLine());

        // Трябва да купи 10% повече също да бъде закръглено нагоре числото
        double studentsDependingBudget = Math.ceil(studentsCount * 1.1); // <- +10 %
        double lightsabersNeed = singleLightsaberPrice * studentsDependingBudget;

        // Изчислявам дрехи/роби
        double robesNeed = singleRobePrice * studentsCount;

        if (studentsCount > 6) {

            // Всеки шести колан е безплатен, затова изчислявам
            // и премахвам студентите, за които коланите ще са безплатни
            int freeBelts = studentsCount / 6;
            studentsCount -= freeBelts;

        }

        double beltsNeed = singleBeltPrice * studentsCount; // <- Колани

        double totalPrice = lightsabersNeed + robesNeed + beltsNeed; // <- Общо цена за всичко

        if (totalPrice <= money) {

            System.out.printf("The money is enough - it would cost %.2flv.%n", totalPrice);

        } else {

            double diff = Math.abs(totalPrice - money);
            System.out.printf("George Lucas will need %.2flv more.%n", diff);

        }

    }

}
