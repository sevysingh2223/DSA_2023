package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstFile {
    public static void main(String[] args) {
        
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.offer(78);
        queue1.offer(20);
        queue1.offer(75);
        queue1.add(521);

        System.out.println("Queue Elemets are :" + queue1);
        System.out.println(queue1.poll());
        System.out.println("Queue elemets are : "+queue1);
        System.out.println(queue1.size());
        System.out.println(queue1.isEmpty());

        System.out.println(queue1.peek());
    }
}
