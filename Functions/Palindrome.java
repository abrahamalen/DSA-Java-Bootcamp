
// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isPalindrome(num);
        in.close();
    }

    static void isPalindrome(int num) {
        int temp, sum = 0, rem;
        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10;
        }

        if (temp == sum)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
