import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// class ABC implements Consumer<Integer>{//CLASS THAT IMPLEMENTS CONSUMER
//     public void accept(Integer i){
//         System.out.println(i);
//     }
// }

public class consumer_interface {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);//PRE BUILT CLASS
        
        //WITH CLASS IMPLIMENTATION
        //Consumer<Integer> obj=new ABC();//OBJECT FOR CONSUMER //DONT FORFET THE GENERICS <>

        //Anonmous class
        // Consumer<Integer> obj=new Consumer<Integer>() {
        //     public void accept(Integer i){
        //         System.out.println(i);
        //     }
        // };

        //NOW USING LAMDA FUNCTIONS
        Consumer<Integer> obj= i -> System.out.println(i);
        list.forEach(obj);//CALLS THE 0th INDEX OF LIST

    }
}
