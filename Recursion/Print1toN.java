package Recursion;

import java.util.Scanner;

public class Print1toN {

    static void print1T0n_app2(int n){
        if(n == 0){
            return;
        }
        print1T0n_app2(n-1);
        System.out.println(n);
    }

    static void print1T0n_app1(int start , int n){
        if(start > n){
            return;
        }
        System.out.println(start);
        print1T0n_app1(start+1, n);
    }
    public static void main(String[] args) {
        System.out.println("Enter Value of n");
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("=============");
        print1T0n_app1(1 , n);
        System.out.println("==========");
        print1T0n_app2(n);
        scan.close();
    }
}
