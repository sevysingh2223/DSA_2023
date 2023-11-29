package Recursion;

public class Print5Hello {
    
    // static void print(int count , int n){
    //     // termination case
    //     if(count == n){
    //         return;
    //     }
    //     System.out.println("Hello");
    //     print(count+1 , n);    //calling same function again : recursion
    // }
    static void print(int n){
        // termination case
        if(n==0){
            return;
        }
        System.out.println("Hello");
        print(n-1);    //calling same function again : recursion
    }
    public static void main(String[] args) {
        print(5);
    }
}
