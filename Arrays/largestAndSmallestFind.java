public class largestAndSmallestFind {
    public static void main(String[] args) {
        int[] arr = {4,5,2,7,9,8};
        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
