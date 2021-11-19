
// Calculate Average Of N Numbers

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        float avg;
        int n, count = 1, number, sum = 0;
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (count <= n) {
            System.out.println("Enter the number ");
            number = sc.nextInt();
            sum += number;
            ++count;
        }
        avg = sum / n;
        System.out.println("Average of " + n + " numbers is: " + avg);

        sc.close();
    }
}
