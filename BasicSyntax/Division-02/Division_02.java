package BasicSyntax;

import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        
        // Важно е да се започне отгоре надолу, за да може при първото намерено,
        // да не се влиза в другите проверки
        if (number % 10 == 0) { // <- Да се дели на 10 без остатък
            
            System.out.println("The number is divisible by 10");
            
        } else if (number % 7 == 0) { // <- Да се дели на 7 без остатък
            
            System.out.println("The number is divisible by 7");
            
        } else if (number % 6 == 0) { // <- Да се дели на 6 без остатък
            
            System.out.println("The number is divisible by 6");
            
        } else if (number % 3 == 0) { // <- Да се дели на 3 без остатък
            
            System.out.println("The number is divisible by 3");
            
        } else if (number % 2 == 0) { // <- Да се дели на 2 без остатък
            
            System.out.println("The number is divisible by 2");
            
        } else { // <- В останалите случай
            
            System.out.println("Not divisible");
            
        }
        
    }
    
}
