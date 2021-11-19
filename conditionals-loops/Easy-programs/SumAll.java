
// Take integer inputs till the user enters 0 and print the sum of all numbers.

import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        int sum = 0, input;
        System.out.println("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println("Sum = " + sum);

        sc.close();

    }
}
