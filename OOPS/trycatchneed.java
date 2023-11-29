package OOPS;

import java.util.Scanner;

public class trycatchneed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();
        System.out.println("Enter Divisor");
        int div = scan.nextInt();
        System.out.println(n/div);
        System.out.println("Code executed successfully.......");
    }
}
