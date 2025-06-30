import java.util.ArrayList;
import java.util.List;

public class arrayList2 {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Lichi");
        fruits.add("Pinnaple");
        System.out.println(fruits);
        fruits.add(1,"Lemon");
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);
        fruits.set(1, "Banana");
        System.out.println(fruits);
        System.out.println(fruits.contains("Lichi"));
    }
}
