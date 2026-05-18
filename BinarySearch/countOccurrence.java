public class countOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4};
        int target = 2;
        int firstOccurrence = firstOccurrence(arr, target);
        int lastOccurrence = lastOccurrence(arr, target);
        int count = 0;
        if(firstOccurrence != -1 && lastOccurrence != -1){
            count = lastOccurrence - firstOccurrence + 1;
        }
        System.out.println("count occurrence = " + count);


 }
   public static int firstOccurrence(int[] arr , int target){
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
        return answer;
   }

   public static int lastOccurrence(int[] arr , int target){
       int start = 0;
        int end = arr.length - 1;
        int answer = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                answer = mid;
                start = mid + 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return answer;
   }
}
