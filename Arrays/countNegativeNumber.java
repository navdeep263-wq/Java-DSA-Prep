//count negative number in array
public class countNegativeNumber {
   public static void main(String[] args) {
    int[] arr = {2,-9,-8,-1,-6,0};
    
      int negativeCount = 0;
      for(int i = 0; i < arr.length; i++){
        if(arr[i] < 0){
            negativeCount++;
        }
        }
      
      System.out.println(negativeCount);
   } 
}
