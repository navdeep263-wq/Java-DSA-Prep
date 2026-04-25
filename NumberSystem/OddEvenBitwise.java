

import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to OddEven bitwise calculator");
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        if((num & 1) == 1){
            System.out.println("Your number is odd");
        }else{
            System.out.println("Your number is even");
        }
        sc.close();
    }
}
