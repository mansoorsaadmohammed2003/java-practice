import java.util.Arrays;
import java.util.List;

public class stram_API_features {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(11,42,13,24,6,78,84,19,10);

        //TRY DIFFERENT STREAM METHODS
        //list.stream().sorted().forEach(System.out::println);//to sort the stream

        //list.stream().distinct().forEach(System.out::println);//to remove duplicate from the stream

        //list.stream().skip(3).forEach(System.out::println);//to skip first 3 elements the stream

        // long l=list.stream().count();
        // System.out.println(l); //to count total n.o of elements in array

    }
}
