package CollectionFrameWorkBYAnujBhaiya;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queues {
    public static void main(String[] args) {
      //Queue<Integer> pq= new PriorityQueue<>();
      Queue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
      //Comparator.reverseOrder() simple way to make min heap to max heap
      pq.offer(40);
      pq.offer(12);
      pq.offer(24);
      pq.offer(36);

      System.out.println(pq);// default min heap
      pq.poll();
      System.out.println(pq);//
      
      System.out.println(pq.peek());





      
    }
}
