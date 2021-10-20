
// Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter a name: ");

        Scanner input = new Scanner(System.in);
        name = input.next();

        System.out.println("Greetings of the day " + name);
    }
}
