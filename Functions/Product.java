
import java.util.Scanner;

// Define a method that returns the product of two numbers entered by user.

public class Product {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter number1: ");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        System.out.println("Enter number2: ");
        num2 = in.nextInt();
        ProductNum(num1, num2);
        in.close();
    }

    static void ProductNum(int num1, int num2) {
        int product = num1 * num2;
        System.out.println("Product of 2 numbers is: " + product);
    }
}
