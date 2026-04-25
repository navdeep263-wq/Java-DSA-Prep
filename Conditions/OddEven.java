

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the number is odd or even\n");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Your number is even");
        } else{
            System.out.println("Your number is odd");

            sc.close();
        }
    }
}
