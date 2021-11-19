
// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int largest = 0, input;
        System.out.println("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        while (input != 0) {
            if (input > largest) {
                largest = input;
            }
            input = sc.nextInt();
        }
        System.out.println("Largest = " + largest);

        sc.close();
    }
}
