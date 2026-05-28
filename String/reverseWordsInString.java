public class reverseWordsInString {
    public static void main(String[] args) {
        String str = "A B C D";
        String[] words = str.split(" ");

        String result = "";
        for(int i = words.length - 1; i >=0; i--){
            result = result + words[i] + " ";
        }

        System.out.println(result.trim());
    }
}
