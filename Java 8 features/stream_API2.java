import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class stream_API2 {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        // for reduce u use binary operators
        // BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
        //     public Integer apply(Integer i,Integer j){
        //         return i+j;
        //     }
        // };
        
        //THIS USING ANONOMOUS BINARY OPERATOR FROM ABOVE
        // Integer sum1=list.stream()
        //                 .filter(i -> i%2==0)
        //                     .map(i -> i*2)
        //                         .reduce(0,b);
        // System.out.println(sum1);

        //THIS COMPLETELY USES LAMDA FUNCTION TO DIRECTLY IMPLEMENTS THE CODE
        Integer sum=list.stream()
                        .filter(i -> i%2==0)
                            .map(i -> i*2)
                                .reduce(0,(i,j) -> i+j);//what identity does is use first index//direct lamda
                                System.out.println(sum);
    }
}