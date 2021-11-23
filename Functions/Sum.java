
// Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter number1: ");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        System.out.println("Enter number2: ");
        num2 = in.nextInt();
        SumNum(num1, num2);
        in.close();
    }

    static void SumNum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of 2 numbers is: " + sum);
    }
}
