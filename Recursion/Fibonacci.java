package DSA_QUESTION.Recursion;

public class Fibonacci {

    static int printFib(int n){
        if(n ==1 || n==2 ){
            return n-1;
        }
        return printFib(n-1) + printFib(n-2);
    }
    public static void main(String[] args) {
        int n =13;
        // System.out.println(printFib(5));
        for(int i = 1;i<=n;i++){
            System.out.print(printFib(i) + "  ");
        }
    }
}
