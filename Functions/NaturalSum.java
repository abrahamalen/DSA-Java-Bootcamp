
// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        System.out.println("Sum is: " + findSum(num));
        in.close();
    }

    static int findSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
