public class countSpaceString {
    public static void main(String[] args) {
        String str = "My Name is Navdeep kaur";
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("The Count of String is: " + count);
    }
}
