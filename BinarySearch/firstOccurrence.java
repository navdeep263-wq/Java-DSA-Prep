public class firstOccurrence {

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4};
        int target = 2;
        int start = 0;
        int end = arr.length - 1;
        int answer = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                answer = mid;
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println("The ans is: " + answer);
    }
}