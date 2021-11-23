
// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter lower limit: ");
        int num1 = in.nextInt();
        System.out.println("Enter upeer limit: ");
        int num2 = in.nextInt();

        prime(num1, num2);

        in.close();
    }

    static void prime(int num1, int num2) {
        int i, j, flag;
        System.out.println("Prime numbers in the given range are: ");
        for (i = num1; i <= num2; i++) {
            if (i == 1 || i == 0)
                continue;

            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.println(i + " ");
        }
    }
}
