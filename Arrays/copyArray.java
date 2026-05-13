public class copyArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] copy = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(copy[i]);
        }
    }
}
