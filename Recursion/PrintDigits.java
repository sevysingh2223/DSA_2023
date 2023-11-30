package Recursion;

public class PrintDigits {

    static void printDigit(int n){
        if(n<=0){
            return;
        }
        int rem = n%10;
        printDigit(n/10);
        System.out.println(rem);
        
    }
    public static void main(String[] args) {
        int n = 2535;
        printDigit(n);
    }
}
