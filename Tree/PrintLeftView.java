package Tree;

import java.util.ArrayList;
import java.util.List;

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

public class PrintLeftView {
    static Node root;

    PrintLeftView(){
        root=null;
    }

    public static void printLeft(){
        List<Integer> result = new ArrayList<>();
        printLeftRec(root,1,result);

        for(Integer element : result){
            System.out.print(element + " ");
        }
    }

    public static void printLeftRec(Node root, int level , List<Integer> list){
        if (root == null) return ;

        if(level > list.size()){
            list.add(root.data);
        }

        printLeftRec(root.right, level+1, list);
        printLeftRec(root.left, level+1, list);

    }

    public static void main(String[] args) {
        PrintLeftView tree = new PrintLeftView();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Left view of binary tree is");
        printLeft();

    }
}
