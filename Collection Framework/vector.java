import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        List<Integer> list = new Vector();

        list.addFirst(8);   // Now valid
        list.add(4);        // Adds at the end
        list.add(1);
        list.set(2,3);
        list.add(1);
        list.add(7);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(3);
        list.remove(9);
        list.addLast(5);    // Now valid

        System.out.println(list);
        System.out.println(list.contains(5));

    }
}