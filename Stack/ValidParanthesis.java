package DSA_QUESTION.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

    static boolean isValidParanthesis(String paranthesis){
        if(paranthesis.length()%2 !=0) {
            return false;
        }
        
        // PARANTHESIS STRING : STACK UPDATE
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i<paranthesis.length();i++){
            char currentBracket = paranthesis.charAt(i);
            // If currentBracket is opening bracket -- push in stack
            if(currentBracket=='(' || currentBracket =='{' || currentBracket=='['){
                stack.push(currentBracket);
            }
            // else currentBracket is closing bracket -- check pair -- pop
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(!findPair(stack.peek() , currentBracket)){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    
    static boolean findPair(char peekCharacter , char currentBracket){
        if(peekCharacter =='(' && currentBracket== ')'){
            return true;
        }
        if(peekCharacter =='{' && currentBracket== '}'){
            return true;
        }
        if(peekCharacter =='[' && currentBracket== ']'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter Paranthesis String");
        Scanner scan = new Scanner(System.in);
        String paranthesis = scan.nextLine();
        System.out.println("Given set of paranthesis is valid  : " + isValidParanthesis(paranthesis));

    }
}
