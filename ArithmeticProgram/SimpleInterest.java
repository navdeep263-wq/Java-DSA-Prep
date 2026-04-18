package ArithmeticProgram;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of principle amount Rs: ");
        int principle = sc.nextInt();
        System.out.print("Enter the value of Rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Now , tell me for how many years are you borrowing this money: ");
        float years = sc.nextFloat();

        float interest = (principle * rate * years)/100;
        System.out.println("The result of simple interest is Rs: " + interest );

        sc.close();
    }
}
