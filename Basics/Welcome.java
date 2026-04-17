import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        
        //input the name from user
        //import the package and take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.next();
        
   System.out.println("Welcome " + name + " to KG coding");
    }
}
