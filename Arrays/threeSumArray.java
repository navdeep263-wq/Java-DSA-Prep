public class threeSumArray {
    public static void main(String[] args) {
        int[] arr = {2,3,6,9,10};
        int target = 11;
        for(int i = 0; i < arr.length -2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
            if(arr[i] + arr[j] + arr[k] == target){
                   System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
            }
        }
    }
}
}
}