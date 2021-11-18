import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the triangle: ");
        double h = sc.nextDouble();
        System.out.println("Enter the base of the triangle: ");
        double b = sc.nextDouble();
        double area = (h * b) / 2;
        System.out.println("Area of the triangle is: " + area);

        sc.close();
    }
}
