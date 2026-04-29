import java.util.Scanner;

// WAP to sum of all odd numbers from 1 to a specific number N.
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the odd number calculator");
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
       int sum = oddSums(num);
        System.out.println("oddSums till " + num + " is: " + sum);
        
         sc.close();
    }

    public static int oddSums(int num) {
       int sum = 0;
       int i = 1;
       while(i <= num){
        sum += i;
        i += 2;
       }
       return sum;
    }
}
