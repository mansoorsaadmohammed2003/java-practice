import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class stream_API1 {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Original List: " + list);

        // CREATE A PREDICATE METHOD
        // Predicate<Integer> pred = new Predicate<Integer>() {
        //     public boolean test(Integer i) {  // Use Integer not int
        //         return i % 2 == 0;
        //     }
        // };

        // //CREATE MAP
        // Function<Integer,Integer> funct=new Function<Integer,Integer>() {
        //     //MAP HAS APPLY METHOD
        //     @Override
        //     public Integer apply(Integer i) {
        //             return i*2; 
        //         }
        // };

        // USE PREDICATE AND FILTER + COLLECT RESULTS
        // list.stream()
        //     .filter(pred)//first u filter ouyt even numbers
        //         .map(funct)//then u use map to multiply them with 2
        //             .forEach(i -> System.out.println(i));//then use foreach to print them

        //OR USE LAMDA TO DO ALL THAT IN ONE LINE
        //instead of doing all that , u can do it in one line as shown below
        list.stream().filter(i -> i%2==0).map(i -> i*2).forEach(System.out::println);
    }
}