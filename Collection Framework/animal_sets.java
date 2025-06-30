import java.util.LinkedHashSet;
import java.util.Set;

public class animal_sets {
    public static void main(String[] args) {
        Set<String> animal=new LinkedHashSet<>();
        animal.add("cat");
        animal.add("dog");
        animal.add("rat");
        animal.add("jerry");
        animal.add("cat");
        System.out.println(animal);

    }
}
