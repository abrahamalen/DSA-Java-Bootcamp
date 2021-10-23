
// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int num1, num2, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        System.out.println("The largest number is: " + result);
        input.close();
    }
}
