//check if number is perfect square or not

public class checkPerfectSquare {
    public static void main(String[] args) {
        int n = 20;
        int start = 0;
        int end = n;
       boolean found = false;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid * mid == n){
              found = true;
                break;
            }else if (mid * mid < n) {
               start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(found){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not Perfect Square");
        }
    }
}
