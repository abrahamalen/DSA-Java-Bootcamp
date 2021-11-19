
// Factorial Program In Java

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number, fact = 1;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of the number " + number + "is: " + fact);

        sc.close();
    }
}
