package ArithmeticProgram;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first = sc.nextInt();
        System.out.println("Enter the second number : ");
        int second = sc.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("The result is: " + add);
        System.out.println("The result is: " + sub);
        System.out.println("The result is: " + mul);
        System.out.println("The result is: " + div);
        System.out.println("The result is: " + mod);
        
        sc.close();

    }
}
