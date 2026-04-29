import java.util.Scanner;

//CAP to find the least common multiple(LCM) of two numbers
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome th LCM");
        System.out.print("Please enter the number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();
        int lcm = lcm(first, second);
        System.out.println("LCM of the two number is: " + lcm);

        sc.close();
    }

    public static int lcm(int first , int second){
        int i = 1;
        while(true) {
             int factor = first * i;
             if (factor % second == 0){
                return factor;
             }
             i++;
        }
    } 
}
