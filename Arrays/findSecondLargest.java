//find second largest number in array
public class findSecondLargest {
    public static void main(String[] args) {
        int[] arr = {4,8,1,9,2};
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int secondLargest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondLargest && arr[i]!= largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
