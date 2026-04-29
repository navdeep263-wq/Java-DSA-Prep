import java.util.Scanner;

//create a program to check whether a given number is prime.
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to prime number");
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
         boolean isPrime = isPrime(num);
         if(isPrime) {
              System.out.println("Your number is prime");
         }else {
          System.out.println("Your number is not prime");
         }
         sc.close();
         
    }
    public static boolean isPrime(int num){
           for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
               }
           }
           return true;
           
    }
}
