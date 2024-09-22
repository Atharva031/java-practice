import java.util.ArrayDeque;

public class LearnArrayDeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offer(21); //Offers element at the end of the queue
        adq.offerFirst(12); //Offers element at the start of the queue
        adq.offerLast(433);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " + adq);
    }
}
