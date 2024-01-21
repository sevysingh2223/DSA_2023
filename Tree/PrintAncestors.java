package Tree;

class Node{
    int data;
    Node left,right;

    public Node(int value){
        this.data = value;
        left=null;
        right=null;
    }
}
public class PrintAncestors {

    static boolean printAnces(Node root , int target){
        if (root == null) return false;

        if(root.data == target){
            return true;
        }

        if(printAnces(root.left, target) || printAnces(root.right, target)){
            System.out.println(root.data + " ");
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        int target = 4;
        System.out.println("Ancestors of a node is");
        printAnces(root, target);
        
    }
}
