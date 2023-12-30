package LINKEDLIST;

class Node{
    public int data;
    public Node next;

    public Node(int value){
        this.data = value;
        this.next=null;
    }
}
class LinkedList {
    public static Node head;
    public LinkedList(){
        this.head = null;
    }

    static void append(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }

    static void delete(int data){
        if(head == null){
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;

        while(current.next!= null && current.next.data !=data){
            current = current.next;
        }

        if(current.next!=null){
            current.next = current.next.next;
        }
    }

    static void display(){
        Node current = head;

        while (current!=null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.display(); // 10
        list.append(20);
        list.append(30);
        list.display();// 10 20 30
        list.delete(10);
        list.display();// 10 30
    }
}