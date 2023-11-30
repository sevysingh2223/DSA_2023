package Recursion;

public class SumOfDigits {
    static int sum = 0;
    static int sumDigit(int n){
        if(n<=0){
            return sum;
        }
        int rem = n%10;
        sum += rem;
        // System.out.println(sum);
        return sumDigit(n/10);
    }
    public static void main(String[] args) {
        int n = 65832;
        System.out.println(sumDigit(n));
    }
}
