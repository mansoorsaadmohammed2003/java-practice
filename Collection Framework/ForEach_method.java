import java.util.ArrayList;
import java.util.List;

public class ForEach_method {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the entire list directly
        System.out.println(list);

        // External loop (indexed for loop)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Enhanced for loop (for-each loop)
        for (Integer i : list) {
            System.out.println(i);
        }

        // Internal loop (forEach method with lambda expression)
        list.forEach(i -> System.out.println(i));
    }
}