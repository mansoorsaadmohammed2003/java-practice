import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_API {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);

        //CREATE STREAM
        Stream str=list.stream();//THIS MAKES LIST INTO STREAM
        //CALLING THE STREAM
        str.forEach(System.out::println);//THIS WORKS LIKE    s1.forEach(i -> System.out.println());

        //NOW IF U TRY TO REUSE A STREAM THEN IT GIVES ERROR
        str.forEach(System.out::println);
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        // at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:311)
        // at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:807)
    }
}