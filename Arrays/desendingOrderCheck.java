//check if array is in descending order.

public class desendingOrderCheck {
    public static void main(String[] args) {
        int[] arr = {9,8,6,4,2,1};
        boolean desending = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                desending = false;
                break;
            }
        }
        if(desending){
            System.out.println("The Array is in Desending order");
        }else{
            System.out.println("The array is not in Desending order");
        }
    }
}
