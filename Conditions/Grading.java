package Conditions;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Grading Calculator\n");
        System.out.println("Enter the percentage: ");
        float percentage = sc.nextFloat();
     
         if(percentage >= 90){
            System.out.println("Great, you have got A");
         }else if (percentage >= 75) {
            System.out.println("Good, you have got B");
         }else if (percentage >= 60) {
            System.out.println("you have got C, work harder next time");
         }else if (percentage >= 30) {
            System.out.println("you have got D, you seriously need to work harder");
         }else{
            System.out.println("Sorry, you have failed the test and got a F");
         }
         sc.close();

    }
}
