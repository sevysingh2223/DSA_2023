package DSA_QUESTION.STRING;

import java.util.Scanner;

class NaivePatternMatching {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER STRING");
        String str = scan.nextLine();
        System.out.println("ENTER PATTERN");
        String pattern = scan.nextLine();
        System.out.println(str);
        System.out.println(pattern);

        int n = str.length();
        int m = pattern.length();

        for(int i =0; i<=n-m ; i++){
            int j ;
            for(j=0;j<m;j++){
                if(str.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }
            if(j == m){
                System.out.println("PATTERN FOUND AT INDEX : " + i);
                break;
            }
        }
    }
}