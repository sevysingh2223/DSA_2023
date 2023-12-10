package DSA_QUESTION.Recursion;

import java.util.ArrayList;

public class SubSequences {

    static ArrayList<String> generateSubseQuence(String str){
        if(str.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char singleChar = str.charAt(0);
        String remString = str.substring(1);
        ArrayList<String> temp = generateSubseQuence(remString);
        ArrayList<String> result  = new ArrayList<>();
        for(String s : temp){
            result.add(s);
            result.add(singleChar + s);
        }

        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = generateSubseQuence("abc");
        for(String item : ans){
            System.out.println(item);
        }
    }
}
