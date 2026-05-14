class findSecondSmallest {
public static void main(String[] args) {
    int[] arr = {2,3,5,4,1,7};
    int small = arr[0];
    for(int i = 1; i < arr.length; i++){
        if(arr[i]<small){
            small = arr[i];
        }
    }
    int secondSmallest = arr[0];
    for(int i = 0; i < arr.length; i++){
        if(arr[i]!=small && arr[i] < secondSmallest){
            secondSmallest = arr[i];
        }
    }
    System.out.println(secondSmallest);
}
    
}