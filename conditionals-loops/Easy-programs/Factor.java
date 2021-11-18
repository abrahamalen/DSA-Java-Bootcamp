
// Input a number and print all the factors of that number.

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        int num, factor;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factor = i;
                System.out.println(factor);
            }
        }
        sc.close();
    }
}
