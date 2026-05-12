//average find 
public class findAverage {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double average = (double)sum/arr.length;
        System.out.println(average);
    }
}
