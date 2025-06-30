import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_HashSet {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet();
        set.add(33);
        set.add(8);
        set.add(12);
        set.add(9);
        set.add(60);
        System.out.println(set);
        set.remove(1);
        System.out.println(set);
        System.out.println(set.contains(8));
        System.out.println(set.contains(5));
        set.clear();
        System.out.println(set);
    }
}
