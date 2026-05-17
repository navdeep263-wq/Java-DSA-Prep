
public class findInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int target = 2;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                System.out.println(mid);
            }else if (arr[mid] < target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(start);
        }
    }

