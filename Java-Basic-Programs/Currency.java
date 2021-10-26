
// Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        float rupees, usd;
        System.out.println("Enter currency in rupees: ");
        Scanner input = new Scanner(System.in);
        rupees = input.nextInt();
        usd = (float) (rupees * 0.013);
        System.out.println("Currency in USD is: " + usd);
        input.close();
    }
}
