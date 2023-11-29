package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // reverse : approach 1
        // String rev ="";
        // for(int i=str.length()-1;i>=0;i--){
        //     rev += str.charAt(i);
        // }
        // System.out.print("Reverse String  :  " +rev );
        

        // approach 2
        // convert string to char array
        char str_arr[] = str.toCharArray();

        for(int s=0 , e=str.length()-1 ;s<str.length()/2;s++,e--){
            char temp = str_arr[s];
            str_arr[s] = str_arr[e];
            str_arr[e] = temp;
        }

        System.out.println("Reverse of Str is : " );
        // print all char of string
        for (char character : str_arr) {
            System.out.print(character +"     ");
        }

    }
}
