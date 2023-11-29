package String;

public class LengthOfWord {
    public static void main(String[] args) {
        String str = "the sky is blue and some birds are flying";
        int k =7;
        int count =0;
        int word_i = 0;
        char arr[] = str.toCharArray();
        // skip k-1 spaces and get the first index of the word
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==' '){
                count++;
            }
            if(count == (k-1)){
                word_i = (i+1);
                break;
            }
        }

        int word_length =0;
        for(int j = word_i ; j<arr.length;j++){
            if(arr[j] == ' '){
                break;
            }
            word_length++;
        }
        System.out.println("Length of word is : " + word_length);
    }
}
