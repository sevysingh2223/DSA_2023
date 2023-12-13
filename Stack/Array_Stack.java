package DSA_QUESTION.Stack;
class Stack{
        private static int maxSize ;
        private static int top ;
        private static int []stackArray;

        public Stack(int capacity){
            this.maxSize = capacity;
            this.top = -1;
            this.stackArray = new int[capacity];

        }

        public void push(int value){
            // overflow 
            if(top < maxSize -1){
                stackArray[++top] = value;
                System.out.println("Element Stored : " + value );
            }
            else{
                System.out.println("Stack Overflow");
            }
        }

        static int pop(){
            if(top >= 0){
                int element = stackArray[top--];
                System.out.print("Removed Element : " );
                return element;
            }
            else{
                System.out.println("Stack Underflow");
                return -1;
            }
        }

        static int peek(){
            if(top >= 0){
                int element = stackArray[top];
                System.out.print("Peek Element is : ");
                return element;
            }
            else{
                System.out.println("Stack Underflow");
                return -1;
            }
        }

        static boolean isEmpty(){
            return (top == -1);
        }

        static boolean isFull(){
            return (top == maxSize-1);
        }

        static void printStack(){
            if(!isEmpty()){
                System.out.println("STACK ELEMENTS ARE : ");
                for(int i =0;i<=top ;i++){
                System.out.print(stackArray[i] + "  ");
            }
            }
            else{
                System.out.println("Stack is empty....");
            }
        }
    }
public class Array_Stack {
    public static void main(String[] args) {
        Stack myStack = new Stack(3);
        myStack.push(20);
        myStack.push(60);
        myStack.push(80);
        // System.out.println(myStack.pop());
        // System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        // System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.isFull());
        myStack.printStack();
    }
}
