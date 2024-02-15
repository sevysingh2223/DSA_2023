package BitsManipulation;

import java.util.Scanner;

public class Bits {

    static int get_ithBit(int n, int i) {
        return ((n >> i) & 1);
    }

    static int set_ithBit(int n, int i){
        return (n | (1 << i));
    }
    static int clear_ithBit(int n, int i){
        return (n &  ~(1 << i));
    }
    static int update_ithBit(int n, int i, int b){
        return (n &  ~(1 << i) | (b<<i));
    }

    public static void main(String[] args) {
        int n = 20; // 10100 in binary
        System.out.println("Original Number: " + n);
        System.out.print("Enter the position of bit to be checked: ");
        Scanner scanner = new Scanner(System.in);
        int i =  scanner.nextInt();
        System.out.print("Enter the updated bit value: ");
        int k =  scanner.nextInt();
        // System.out.println(i + "th bit is  :" + get_ithBit(n, i)); // prints the value of 4th bit from
        // System.out.println(i + "th bit is  :" + set_ithBit(n, i)); // prints the value of 4th bit from
        // System.out.println(i + "th bit is  :" + clear_ithBit(n, i)); // prints the value of 4th bit from
        System.out.println("updated value is   :" + update_ithBit(n, i ,k)); // prints the value of 4th bit from
    }
}
