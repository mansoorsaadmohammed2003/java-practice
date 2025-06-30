import java.util.PriorityQueue;

public class priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.offer(3);
        queue.add(7);
        queue.add(9);
        queue.offer(1);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove(3);
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.containsAll(queue));

    }
}
