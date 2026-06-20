import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example_stream {
    static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,6,7,8,775,35,54,545);
        List<Integer> filter= list.stream()
                .filter(x->x%2==0)
                .map(x->x/2).distinct()
               .sorted((a,b)->(a-b)).collect(Collectors.toList());
        System.out.println(filter);
        List<Integer> collect = Stream.iterate(0, n -> n + 1).skip(1).limit(102).filter(n -> n%2==0).sorted((a,b)->b-a).toList();
        System.out.println(collect);
        Integer i = Stream.iterate(0, n -> n + 1).skip(1).limit(50).max((a, b) -> a-b).get();
        System.out.println(i);
        Integer i2 = Stream.iterate(0, n -> n + 1).skip(1).limit(50).map(n->n/12).distinct().peek(System.out::println).max((a, b) -> a-b).get();
        System.out.println(i2);
        Long i3 = Stream.iterate(0, n -> n + 1).skip(1).limit(50).count();
        System.out.println(i3);
    }
}
