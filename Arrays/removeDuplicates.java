public class removeDuplicates {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {1,1,2,2,3,4,4};
        //index show the position
        //where the next unique element will be stored
        int index = 1;
        for(int i = 1; i < arr.length; i++){
            //compare current element with previous element
            if(arr[i] != arr[i - 1]){
                arr[index] = arr[i];
                index++;
            }
        }
        //print only unique elements
        for(int i = 0; i < index; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
