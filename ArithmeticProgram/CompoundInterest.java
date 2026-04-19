import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of principle amount Rs: ");
        int principle = sc.nextInt();
        System.out.print("Enter the value of Rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Now , tell me for how many years are you borrowing this money: ");
        float years = sc.nextFloat();

        double compoundInterest = principle * Math.pow((1 + rate / 100) , years);
        System.out.println("your compoundInterest is Rs : " + compoundInterest);

        sc.close();
    }
}
