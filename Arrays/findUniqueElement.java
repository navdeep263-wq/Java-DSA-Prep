public class findUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        int unique = 0;
        for(int i = 0; i < arr.length; i++){
            unique = unique ^ arr[i];
        }
        System.out.println("The unique element is: " + unique);
    }
}
