import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        //calculate the factorial without using function
        // int number = 5;
        // int factorial = 1;

        // for(int i = 1; i <= number; i++){
        //     factorial = factorial * i;
        // }
        // System.out.println(factorial);

        //write a function that calculate the factorial of a given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to factorial");
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        long fact = factorial(num);
         System.out.println("The factorial of " + num + " is " + fact);

         sc.close();
    }
    public static long factorial(int num){
         long fact = 1;
         for(int i = 1; i <= num; i++){
            fact = fact * i;
         }
         return fact;
    }

}
