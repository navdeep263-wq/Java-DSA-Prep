import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        // String str = "hello";
        // for(int i = 0; i < str.length(); i++){
        //      str = 
        // }

        for(int i = str.length() - 1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }
    }
}
