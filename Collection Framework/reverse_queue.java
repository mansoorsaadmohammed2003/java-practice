import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_queue {
        public static void main(String[] args) {
        Queue<Character> queue=new LinkedList<>();
        Stack<Character> stack=new Stack<>();
        queue.add('S');
        queue.add('A');
        queue.add('A');
        queue.add('D');
        System.out.println("Orignal Queue is :"+queue);
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        System.out.println("Stack is : "+stack);
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println("reversed queue is :"+queue);
    }
}
