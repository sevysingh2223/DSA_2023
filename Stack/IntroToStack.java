package DSA_QUESTION.Stack;

import java.util.Stack;

public class IntroToStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        // push elements
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        myStack.push(70);
        myStack.push(80);

        // remove element
        myStack.pop();

        // shows the peek element
        System.out.println(myStack.peek());

        // shows the vector array
        System.out.println(myStack.capacity());

        // number of elements
        System.out.println(myStack.size());

    }
}
