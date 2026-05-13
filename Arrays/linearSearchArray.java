import java.util.Scanner;

public class linearSearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of array:");
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value:");
        int target = sc.nextInt();
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
           found = true;
           break;
            }
        }
        if(found){
            System.out.println("element found ");
        }else{
            System.out.println("element not found");
        }
        sc.close();
    }
}
