// Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        evenodd(num);

        in.close();
    }

    public static void evenodd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
