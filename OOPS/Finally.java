package OOPS;

import java.util.Scanner;

public class Finally {

    static int func(int n , int div){
        return n/div;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();
        System.out.println("Enter Divisor");
        int div = scan.nextInt();

        try {
            int quotient = func(n , div);
            System.out.println("Quotient is : " + quotient);
        } catch (Exception e) {
            System.err.println("Eroor found is " + e.getMessage());
        }
        finally{
            System.out.println("Code executed successfully");
        }
    }
}
