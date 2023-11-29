package Recursion;

import java.util.Scanner;

public class Table {

    static void printTable(int n, int i){
        if(i > 10){
            return;
        }
        System.out.println(n +" * " + i + " = " + (n*i));
        printTable(n, i+1);
    }

    public static void main(String[] args) {
        System.out.println("Enter Value of n");
        System.out.println("=============");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printTable(n , 1);
        scan.close();
    }
}
