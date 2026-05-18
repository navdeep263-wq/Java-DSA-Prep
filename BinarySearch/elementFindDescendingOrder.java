public class elementFindDescendingOrder {

    public static void main(String[] args) {
         int[] arr = {90,80,70,60,50,40,30};
        int target = 60;
        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
               answer = mid;
                break;
            }else if (arr[mid] < target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        System.out.println("Index = " + answer);
    }
}