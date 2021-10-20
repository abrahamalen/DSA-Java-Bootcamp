
// Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number: ");

        // The input provided by the user is stored in num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        // If number divisible by 2 then it is even else it is odd.
        if (num % 2 == 0)
            System.out.println("The number entered is even");
        else
            System.out.println("The number entered is odd");
    }
}
