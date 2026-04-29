import java.util.Scanner;

//CAP that compute the sum of the digits of an integer.
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to sum of digits");
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        int sum = SumOfDigit(num);
        System.out.println("The Sum of " + num + " is " + sum);

        sc.close();
     }
        
     public static int SumOfDigit (int num) {
           int sum = 0;
           while ( num > 0){
            sum += num%10;
            num /= 10;
           } 
            return sum;
        }
       
    }

