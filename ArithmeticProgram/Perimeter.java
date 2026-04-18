package ArithmeticProgram;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the perimeter of rectangle");
        System.out.println("Enter the value of A");
        double A = sc.nextDouble();
        System.out.println("Enter the value of B");
        double B = sc.nextDouble();
        System.out.println("Enter the value of C");
        double C = sc.nextDouble();
        System.out.println("Enter the value of D");
        double D = sc.nextDouble();
 
       Double perimeter = A + B + C + D;
       
        System.out.println("The Perimeter of Rectangle is: " + perimeter + "cm");
        sc.close();
    }
}
