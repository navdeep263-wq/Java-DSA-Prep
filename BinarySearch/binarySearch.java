public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,15};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        
        boolean found = false;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                found = true;
                break;
            }else if (arr[mid] < target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(found){
            System.out.println("The Element is found");
        }else{
            System.out.println("The elemnet is not found");
        }
    }
}
