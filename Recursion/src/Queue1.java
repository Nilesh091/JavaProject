import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Peek front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println(queue.poll() + " dequeued.");
        System.out.println("Queue after dequeue: " + queue);

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.offer(40);
        System.out.println("Queue: " + queue);

    }
}
