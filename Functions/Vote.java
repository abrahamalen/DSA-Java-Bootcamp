
// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter the age of the person: ");
        Scanner in = new Scanner(System.in);
        age = in.nextInt();
        votingAge(age);
        in.close();
    }

    static void votingAge(int age) {
        if (age >= 18)
            System.out.println("The person is eligible to vote.");
        else
            System.out.println("The person is not eligible to vote.");
    }
}
