import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);//ADD
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(2,25);//ADD IN INDEX
        System.out.println(list);
        list.remove(2);//REMIOVE
        System.out.println(list);
        list.contains(2);
        list.set(0, 15);//SET NUMBER
        System.out.println(list);
        System.out.println(list.contains(20));//LIST
        System.out.println(list.contains(10));
        System.out.println(list.size());//SIZE
    }
}
