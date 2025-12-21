package Java_Collections.Queue.PriorityQueue;
//It is based on Min Heap

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueues {
    //returns min element whenever peeked
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pqMin = new PriorityQueue<>();
        PriorityQueue<Integer> pqHigh = new PriorityQueue<>(Collections.reverseOrder());

        pqMin.offer(1);
        pqMin.offer(2);
        pqMin.offer(3);
        System.out.println(pqMin.peek());
        pqHigh.offer(1);
        pqHigh.offer(2);
        pqHigh.offer(3);
        System.out.println(pqHigh.peek());
    }
    

}
