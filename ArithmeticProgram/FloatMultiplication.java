

import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        double mul = num1 * num2;
        System.out.println("The result is: " + mul);

        sc.close();
    }
}
