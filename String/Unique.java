package String;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("first string is : ");
        String str = sc.nextLine();
        boolean flag=true;
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length()-1;j++){
                if(str.charAt(i)==str.charAt(j)){
                flag=false;
                break;
                }
            }
            }

        if(flag){
            System.out.println("Unique");
        }
        else{
            System.out.println("Repeating");
        }
        }
    }
