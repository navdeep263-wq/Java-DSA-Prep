

import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR operatoe\n");
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();

        int result = first ^ second;
        System.out.println("Result is: " + result);

        sc.close();
    }
}
