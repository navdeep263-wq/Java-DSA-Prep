import java.util.Scanner;

//reate a program to reverse the digits of a number
public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome tho reverse the digits");
        System.out.println("Enter your number:");
        int num = sc.nextInt();
        int reverse = reverse(num);
        System.out.println("The reverse of number is: " + reverse);

        sc.close();
    }

    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
