import java.util.Scanner;

class printlength{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.next();

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
       
        System.out.println("Length is : " + name.length());
        System.out.println("first letter : " + name.charAt(0));
        System.out.println("Last letter : " + name.charAt(name.length() - 1));

    }
}