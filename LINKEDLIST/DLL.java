package LINKEDLIST;

class Node{
    public int data;
    public Node next;
    public Node prev;
    public Node(int data){
        this.data =data;
        this.next=null;
        this.prev = null;
    }

}
 class DoublyLL{
    static Node head;
    static Node tail;

        DoublyLL(){
            this.head =null;
            this.tail = null;
        }

        static void append(int data){
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail =newNode;
                
            }
            else{
                tail.next=newNode;
                newNode.prev =tail;
                tail =newNode;
            }
        }

        static void delete(int data){
            Node temp = head;
            while(temp != null && temp.data!=data){
                temp = temp.next;
            }

            if(temp == null){
                System.out.println("No such element found");
                return;
            }

            // link to prev node

            if(temp.prev != null){
                temp.prev.next = temp.next;
            }
            else{
                head = temp.next;
            }

            // link to next node

            if(temp.next!= null){
                temp.next.prev = temp.prev;
            }
            else{
                tail = temp.prev;
            }
        }

        static void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static void size() {
        Node current = head;
        int count = 0;
        while (current != null) {
            // System.out.print(current.data + " ");
            count++;
            current = current.next;
        }
        System.out.println("Size of LL is  : "+ count);
    }

 }

public class DLL {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.append(10);
        list.append(20);
        list.display();

        list.append(30);
        list.display();
        list.size();

        list.delete(20);
        list.display();
    }
    
}
