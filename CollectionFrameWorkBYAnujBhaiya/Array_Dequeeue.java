package CollectionFrameWorkBYAnujBhaiya;

import java.util.ArrayDeque;

public class Array_Dequeeue {
    public static void main(String[] args) {
       ArrayDeque<Integer> ad=new ArrayDeque<>();
       ad.offer(2);
       ad.offer(1);
       ad.offer(10);
       ad.offerFirst(11);
       ad.offerLast(0);
       ad.offer(2000);
       System.out.println(ad);

       System.out.println(ad.poll());
       System.out.println(ad);

       System.out.println(ad.pollFirst());
       System.out.println(ad);

       System.out.println(ad.pollLast());
       System.out.println(ad);

    




       System.out.println(ad.peek());
       System.out.println(ad);

       System.out.println(ad.peekFirst());
       System.out.println(ad);

       System.out.println(ad.peekLast());
       System.out.println(ad);


       

    }
}
