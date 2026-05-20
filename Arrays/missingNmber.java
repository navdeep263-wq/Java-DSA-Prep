public class missingNmber {
    public static void main(String[] args) {
        //using linear search
        // int[] arr = {0,1,2,4,5};
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] != i){
        //         System.out.println("Missing Number: " + i);
        //         break;
        //     }
        // }

        //using binary search
        // int[] arr = {0,1,2,4,5};
        // int start = 0;
        // int end = arr.length - 1;
        // while(start <= end){
        //     int mid = start + (end - start)/2;
        //     if(arr[mid] == mid){
        //         start = mid + 1;
        //     }else{
        //         end = mid - 1;

        //     }
        // }
        // System.out.println("Missing number: " + start);

        //using optimized formula
          int[] arr = {0,1,2,4,5};
          int n = arr.length;
          int total = n * (n + 1)/2;
          int sum = 0;
          for(int num : arr){
            sum += num;
          }
          System.out.println("Missing Number = " + (total - sum));

    }
}
