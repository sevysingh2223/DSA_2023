package String;

import java.util.Scanner;

public class RLE {

    // public static void main(String[] args) {
    //     // Scanner sc = new Scanner(System.in);
    //     // System.out.println("string is : ");
    //     String str2 = "aaabbcccc";
    //     for(int i=0;i<str2.length();i++){
    //         int count=1;
    //         while(i<str2.length()-2 && str2.charAt(i)==str2.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
    //         str2 += str2.charAt(i);
    //         str2 += count;
    //         System.out.println(str2);

    //     }
    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the string");
        String Str = "aaabbbbbbbbbcc";
       char arr[] = Str.toCharArray();
       for (int i = 0;i<arr.length-1;i++){
        int count =1;
        for (int j = i+1;j<arr.length;j++){
           if(arr[i]==arr[j]){
            count ++;
            i = j;
           }
        }
          System.out.print(arr[i]+" " + count+ " ");
      }

    }
}
