
// Write a program to print the factorial of a number by defining a method. 

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        fact(num);
        in.close();
    }

    static void fact(int num) {
        int i, facto = 1;
        for (i = 1; i <= num; i++) {
            facto *= i;
        }
        System.out.println("Factorial of the number is: " + facto);
    }
}
