package Functions;

import java.util.Scanner;

public class Intro {

    static void add(int a , int b){
        System.out.println(a+b);
    }
    static void sub(int a , int b){
        System.out.println(a-b);
    }
    static void mul(int a , int b){
        System.out.println(a*b);
    }
    static void rem(int a , int b){
        System.out.println(a%b);
    }
    public static void main(String[] args) {
        System.out.println("Hello, User!"); 
        System.out.println("Enter numbers");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Select Option");
        System.out.println(" 1 : ADD ");
        System.out.println(" 2 : SUB ");
        System.out.println(" 3 : MUL ");
        System.out.println(" 4 : REM ");

        
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                add(num1 , num2);
                break;
            case 2:
                sub(num1 , num2);
                break;
            case 3:
                mul(num1 , num2);
                break;
            case 4:
                rem(num1 , num2);
                break;
        
            default:
            System.out.print("Invalid option selected");
                break;
        }
    }
}
