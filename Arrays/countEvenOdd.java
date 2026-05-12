// even odd number count in java
public class countEvenOdd {
    public static void main(String[] args) {
        int[] arr = {4,7,2,9,6};
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
