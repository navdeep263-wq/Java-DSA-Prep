public class findSquareRoot {
    public static void main(String[] args) {
        int n = 25;
        int start = 0;
        int end = n;
        int answer = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid * mid == n){
               answer = mid;
                break;
            }else if (mid * mid < n) {
                answer = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
         System.out.println("The square root is: " + answer); 
}
}