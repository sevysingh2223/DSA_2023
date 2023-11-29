package String;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scan.nextLine();
                sentence+="abc";
        
                String name = "ram";
                String name2 = new String("ram");

        System.out.println(sentence);
        // System.out.println("Enter sentence");
        // String sentence2 = scan.next();
        // System.out.println(sentence2);

        int n = scan.nextInt();
        n+=100;
        System.out.println(n);

        
        scan.close();
    }
}
