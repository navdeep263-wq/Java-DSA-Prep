package ArithmeticProgram;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your base value in cms: ");
        double base = sc.nextDouble();
        System.out.println("Now,enter your perpendicular height in cms: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("The Area of Triangle is : " + area + " cms2");

        sc.close();
    }
}
