package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseElements {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(125);
        queue.offer(4);
        queue.offer(5);
        queue.offer(1);
        int n = queue.size();
        Queue<Integer>tempQueue1 = new LinkedList<>();
        Queue<Integer>tempQueue2 = new LinkedList<>();
        for (int i = 0; i < n; i++) {            

           while(queue.size()!=1) {
            tempQueue1.offer(queue.poll());            
           }

           tempQueue2.offer(queue.poll());
           while (!tempQueue1.isEmpty()) {
            queue.offer(tempQueue1.poll());           
           }
        }     
        
         System.out.println(tempQueue2);
}
}
