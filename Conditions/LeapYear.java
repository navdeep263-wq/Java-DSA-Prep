package Conditions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to new leap year calculator");
        System.out.println("Enter the year that you want to check: ");
        int year = sc.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("This is leap year");
        }else{
            System.out.println("This is not leap year");
        }

        sc.close();
    }
}
