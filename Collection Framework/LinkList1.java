import java.util.LinkedList;

public class LinkList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(8);   // Now valid
        list.add(4);        // Adds at the end
        list.add(1);
        list.set(2,3);
        list.add(1);
        list.add(7);
        list.addLast(4);
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