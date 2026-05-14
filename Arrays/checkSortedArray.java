import java.util.Scanner;

 public class checkSortedArray {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size or number of array: ");
    int[] arr = new int[5];
    for(int i = 0; i < arr.length; i++){
       arr[i] = sc.nextInt();
   }
        boolean sorted = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
        sc.close();
    
}
}