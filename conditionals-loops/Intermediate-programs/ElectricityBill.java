import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        int units;
        double bill = 0;

        System.out.println("Enter the units: ");
        Scanner sc = new Scanner(System.in);
        units = sc.nextInt();

        if (units < 100) {
            bill = units * 1.2;
        } else if (units < 300) {
            bill = 100 * 1.20 + (units - 100) * 2;
        } else if (units > 300) {
            bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }

        System.out.println("Bill amount to pay is: " + bill);
        sc.close();
    }
}
