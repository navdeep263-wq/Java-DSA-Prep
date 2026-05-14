// find largest difference between two elements.

public class largestDifference {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,31};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int difference = max - min;
        System.out.println("The Largest Difference = " + difference);
    }
}
