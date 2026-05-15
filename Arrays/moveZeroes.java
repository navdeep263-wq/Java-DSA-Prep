
public class moveZeroes {
     public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int index = 0;

        //move non-zeroes elements forward
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        //fill remaining places with zero
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        //print array
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        for(int num : arr){
            System.out.println(num + " ");
        }
     }
    
}