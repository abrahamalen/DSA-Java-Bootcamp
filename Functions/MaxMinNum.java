
// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MaxMinNum {
    public static void main(String[] args) {
        int first, second, third;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        first = in.nextInt();
        System.out.println("Enter second number: ");
        second = in.nextInt();
        System.out.println("Enter third number: ");
        third = in.nextInt();

        int smallest = smallest(first, second, third);
        int largest = largest(first, second, third);

        System.out.println("Maximum is: " + largest);
        System.out.println("Minimum is: " + smallest);

        in.close();
    }

    public static int smallest(int first, int second, int third) {
        int min = first;

        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }

        return min;
    }

    public static int largest(int first, int second, int third) {
        int max = first;

        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }

        return max;
    }
}
