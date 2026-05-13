import java.util.Scanner;

public class frequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number which find the frequency: ");
        int target = sc.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
