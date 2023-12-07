package DSA_QUESTION.STRING;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NPM2 {

    static List<Integer> naivePatternSol(String str , String pattern){
        List<Integer> list = new ArrayList<>();
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
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER STRING");
        String str = scan.nextLine();
        System.out.println("ENTER PATTERN");
        String pattern = scan.nextLine();
        System.out.println(naivePatternSol(str, pattern));
        scan.close();
    }
}
