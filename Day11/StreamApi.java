import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi{
    // stream makes the work easy 
    //stream  Best for data transformations
    public static void main(String[] args) {
        List<Integer> nums =  Arrays.asList(2,8,6,4,7,1);
        // this is method 1
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n-> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e)-> c+e);

        // method 2
       int result = nums.stream()
                .filter(n-> n%2==0)  // filter needs a object of  Predicate
                .map(n -> n*2)  //  map needs a object of functional interface
                .reduce(0, (c,e)-> c+e);  // 0 is a initial value  
 

        System.out.println(result);

        Stream<Integer> sortedValue =  nums.stream()
                .filter(n-> n%2==0)  
                .sorted();
 
           sortedValue.forEach( n -> System.out.println(n));

        // s2.forEach( n -> System.out.println(n));

        // stream is a interface  stream is used instade of changing the real data .. 
        // once we use the  stream we can't use the same stream we will get run time error 
        // benfits of stream is that it will provide use many methods


    }
}