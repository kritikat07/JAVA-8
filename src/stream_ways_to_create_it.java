import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_ways_to_create_it {
    public static void main(String[] args){
        //HOW TO CREATE A STREAM :
        // for list
       List<String> list= Arrays.asList("apple","banana","kiwi");
        Stream<String> myStream = list.stream();
        // for arrays
        String[] array= {"apple","kiwi","banana"};
        Stream<String> stream1 = Arrays.stream(array);
        //by iterate:
        Stream<Integer> limit=Stream.iterate(0,n->n+1).limit(100);
        // by generate:
        Stream<String> limit1= Stream.generate(()->"hello").limit(5);
        Stream<Integer> limit2= Stream.generate( ()->(int)(Math.random()*100)).limit(500);
        //
        Stream<Integer> limit3=Stream.of(1,2,3);
    }

}
