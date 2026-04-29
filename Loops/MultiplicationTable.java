import java.util.Scanner;

// Develop a program that prints the multiplication table for a given number.
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to multiplication table");
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        printMultiplicationTable(num);

        sc.close();
    }

    public static void printMultiplicationTable(int num){
     int i = 1;
     while(i <= 10) {
        System.out.println(num + " X " + i + " = " + (num * i));
        i++;
     }
    }
}