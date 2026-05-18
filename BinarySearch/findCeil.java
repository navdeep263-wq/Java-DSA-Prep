public class findCeil {
    public static void main(String[] args) {
         int[] arr = {2,4,6,8,10};
        int target = 7;
        int start = 0;
        int end = arr.length - 1;
        int ceil = -1;

        while(start <= end){
            int mid= start + (end - start)/2;
            if(arr[mid] == target){
                ceil = arr[mid];
                break;
            }else if (arr[mid] < target) {
                start = mid + 1;
            }else{
                ceil = arr[mid];
                end = mid - 1;
            }
}
System.out.println("The ceil: " + ceil);
    }
}
