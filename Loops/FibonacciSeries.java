import java.util.Scanner;

// Create a program to print the Fibonacci series up to a certain number
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci series ");
        System.out.print("Enter the number up to which series has to be printed:");
        int num = sc.nextInt();
        System.out.println("Here is the Fibonacci series");
        printFibonacci(num);
        sc.close();

    }
      public static void printFibonacci(int num){
             if (num < 0) return;
             System.out.print("0 ");
             if(num == 0) return;
             System.out.print("1 ");

             int first = 0 ,  second = 1;
             while(first + second <= num) {
                int third = first + second;
                System.out.print(third + " ");
                first = second;
                second = third;
             }

            }
            
      }

