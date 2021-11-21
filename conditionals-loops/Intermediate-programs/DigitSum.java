
// Sum Of A Digits Of Number

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        int sum = 0, num;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of the digits in the number is: " + sum);

        sc.close();
    }
}