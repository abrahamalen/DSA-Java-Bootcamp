
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float p, t, r, si; // principal amount, time, rate, simple interest respectively

        System.out.println("Enter the values for p, t and r");
        Scanner input = new Scanner(System.in);

        p = input.nextFloat();
        t = input.nextFloat();
        r = input.nextFloat();

        si = (p * r * t) / 100;

        System.out.println("Simple Interest is: " + si);
    }
}
