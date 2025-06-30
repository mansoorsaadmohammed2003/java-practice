import java.util.List;
import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        List<Integer> list=new java.util.LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.addLast(400);//ADD LAST INDEX
        list.addFirst(5);//ADD IN FIRST INDEX
        System.out.println(list);
        int count=0;
        for (int i = 0; i < 100; i++) {
            list.addFirst(count);
            list.addLast(count);
            count++;
        }
        System.out.println(list);
    }
}
