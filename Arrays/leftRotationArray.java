public class leftRotationArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //store the first element
        int first = arr[0];
        //shift elements to the left
        for(int i = 0; i < arr.length -1; i++){
            arr[i] = arr[i + 1];
     }
     //place the first element in the last position
       arr[arr.length -1] = first;

       //print array
       for(int num : arr){
        System.out.println(num + " ");
       }
    }
}
