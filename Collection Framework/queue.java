import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> queues=new LinkedList<>(); 
            queues.offer("Ishq");
            queues.offer("Aftab");//OFFER FOR ADDING ELEMENTS
            queues.offer("Saad");
            System.out.println(queues);
            System.out.println(queues.peek());//PEEK IS TO GET FIRST ELEMENT IN LIST
            queues.poll();//POLL IS FOR REMOVING ELELEMNTS
            System.out.println(queues);
            System.out.println(queues.contains("Saad"));
            System.out.println(queues.size());
            queues.clear();
            System.out.println(queues);

    }
}
