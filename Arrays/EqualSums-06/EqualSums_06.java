import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numArr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;
        for (int i = 0; i < numArr.length; i++) {

            int leftSum = 0;
            int rightSum = 0;


            for (int leftIndex = 0; leftIndex < i; leftIndex++) {

                leftSum += numArr[leftIndex];
            }


            for (int rightIndex = i + 1; rightIndex < numArr.length; rightIndex++) {

                rightSum += numArr[rightIndex];

            }

            if (leftSum == rightSum) {
                System.out.println(i);
                isFound = true;
                break;

            }


        }


        if (!isFound) {
            System.out.println("no");
        }


    }
}
