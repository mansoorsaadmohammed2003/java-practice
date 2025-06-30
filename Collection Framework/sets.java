import java.util.HashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Ishq");
        set.add("Aftab");
        set.add("Ubada");
        set.add("Ali");
        set.add("Irfan");
        System.out.println(set);
        set.remove("Ishq");
        System.out.println(set);
        System.out.println(set.contains("Aftab"));
        System.out.println(set.contains("Ishq"));
    }
}
