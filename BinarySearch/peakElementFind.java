public class peakElementFind {
    public static void main(String[] args) {
        int[] arr = {1,3,20,4,1};
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        System.out.println("The peak element is: " + arr[start]);
    }
}
