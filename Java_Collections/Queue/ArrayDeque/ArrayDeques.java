package Java_Collections.Queue.ArrayDeque;
import java.util.ArrayDeque;
public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(1);
        ad.offer(2);
        ad.offer(3);
        ad.offer(4);
        ad.offerFirst(5);
        ad.offerLast(6);
        ad.poll();
        ad.peek();
        ad.size();

    }
}
