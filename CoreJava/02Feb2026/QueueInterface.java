/**
 * Queue Interface - FIFO (LinkedList, PriorityQueue)
 * Topic: Programming Foundation with Java - 02 Feb 2026
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("First");
        q.offer("Second");
        q.offer("Third");

        System.out.println("Queue: " + q);
        System.out.println("Peek: " + q.peek());
        System.out.println("Poll: " + q.poll());
        System.out.println("After poll: " + q);
        System.out.println("Poll: " + q.poll());
        System.out.println("Poll: " + q.poll());
        System.out.println("Empty: " + q.isEmpty());
    }
}
