

import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to showcase RightShift operator\n");
        System.out.println("Please enter your number");
        int num = sc.nextInt();

        int result = num >> 1;
        System.out.println("Your result is: " + result);

        sc.close();
    }
}
