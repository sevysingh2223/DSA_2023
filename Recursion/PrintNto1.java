package Recursion;

import java.util.Scanner;

public class PrintNto1 {

    static void print1T0n(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        print1T0n(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter Value of n");
        System.out.println("=============");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        print1T0n(n);
        scan.close();
    }
}
