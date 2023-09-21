import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamApi{
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // Stream can be accessed/processed only once.
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        Stream<Integer> s4 = s3.sorted();


        s4.forEach(n -> System.out.println(n));

        // OR shortened with functional interface and lambda func
        int result = nums.stream()
                    .filter(n -> n%2==0)
                    .map(n -> n*2)
                    .reduce(0, (c, e) -> c+e);
        
        System.out.println(result);

        // Parallel in diff Threads
        int result1 = nums.parallelStream()
            .filter(n -> n%2==0)
            .map(n -> n*2)
            .reduce(0, (c, e) -> c+e);
        
        System.out.println(result1);

    }
}