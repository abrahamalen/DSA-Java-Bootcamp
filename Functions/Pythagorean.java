
// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        System.out.println("Enter the triplet: ");
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        PyTriplet(num1, num2, num3);

        in.close();
    }

    static void PyTriplet(int num1, int num2, int num3) {
        int sum1 = (num1 * num1) + (num2 * num2);
        int sum2 = (num1 * num1) + (num3 * num3);
        int sum3 = (num3 * num3) + (num2 * num2);

        int sq1 = num1 * num1;
        int sq2 = num2 * num2;
        int sq3 = num3 * num3;

        if (sum1 == sq3 || sum2 == sq2 || sum3 == sq1)
            System.out.println("Pythagorean Triplets");
        else
            System.out.println("Not Pythagorean Triplets");

    }
}
