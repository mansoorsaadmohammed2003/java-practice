import java.util.PriorityQueue;

public class priority_queue_aplorder {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("dog");
        queue.add("cat");
        queue.offer("zain");
        queue.add("ball");
        queue.add("apple");
        queue.offer("dog");
        while (!queue.isEmpty()) {
        System.out.println(queue.poll());
        }
    }
}
