package String;

public class TrimMethod {
    public static void main(String[] args) {
        
        String str = "    hello      ";
        String ans ="";
        char [] array = str.toCharArray();
        int first=0 , last =0;
        for(int i=0;i<array.length;i++){
             if(array[i] != ' '){
                first = i;
                break;
            }
        }
        for(int j=array.length-1;j>=0;j--){
             if(array[j] != ' '){
                last = j;
                break;
            }
        }

        for(int i = first ; i<= last;i++){
            ans += array[i];
        }

        System.out.println(ans);
    }
}
