package Tree;

class Node {
    public int data;
    public Node left;
    public Node right;
    

    public Node(int value) {
        this.data = value;
        this.right = null;
        this.left =null;
    }
}
class Tree{
    public static Node root;

    public Tree() {
        this.root = null;

    }
     static void append( int value) {
        root =appendRec(root , value);

        
    }
    static Node appendRec(Node root,int value){
        if (root ==null) {
            root =new Node(value);
            return root;
        }
        if (value<root.data) {
            root.left=appendRec(root.left, value);
            
        }
       else if(value>root.data){
        root.right=appendRec(root.right, value);

       }
       return root;
    }
    static void display(){
        inorderTraversalReC(root);

    }
    static void inorderTraversalReC(Node root){
        if (root!=null) {
            inorderTraversalReC(root.left);
            System.out.print(root.data + "  ");
            inorderTraversalReC(root.right);           
        }
    }

}

public class TreeImplementation {
    public static void main(String[] args) {
        Tree tree =new Tree();
        tree.append(10);
        tree.append(20);
        tree.append(30);
        tree.append(40);
        tree.display();
    }
}

