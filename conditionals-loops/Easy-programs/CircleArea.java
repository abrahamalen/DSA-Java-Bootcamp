import java.util.Scanner;

// Area Of Circle Java Program

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double area = (22 * r * r) / 7;
        System.out.println("Area of the circle is: " + area);

        sc.close();
    }
}