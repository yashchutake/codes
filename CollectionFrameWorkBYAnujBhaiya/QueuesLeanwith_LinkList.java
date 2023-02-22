package CollectionFrameWorkBYAnujBhaiya;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesLeanwith_LinkList {
    public static void main(String[] args) {
   
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(12);
        queue.offer(11);
        queue.offer(13);
        queue.offer(111);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.peek());



    }
}
