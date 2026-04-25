

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the number is positive negative or zero");
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("The number is positive");
        } else if (num == 0) {
            System.out.println("The number is zero");
            }else{
                System.out.println("The number is negative");

                sc.close();
            }
    }
}
