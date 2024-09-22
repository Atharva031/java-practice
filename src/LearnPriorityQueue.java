import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(12);
        pq.offer(40);
        pq.offer(35);
        pq.offer(55);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }
}
