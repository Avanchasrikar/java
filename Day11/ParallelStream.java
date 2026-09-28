import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// The most common way to add a delay in Java is by using Thread.sleep() or TimeUnit.sleep(), 
// which temporarily pauses the execution of the current thread
public class ParallelStream {
    public static void main(String[] args) {

        int size = 10_000;
        Random ran = new Random();
        List<Integer> num = new ArrayList<>(size);

        for(int i =1 ; i<size;i++){
            num.add(ran.nextInt(100)); // 100 is bound 
        }
        // System.out.println(num);

        int sum = num.stream()
                        .map(i -> i*2)
                        .reduce(0, (c,e) ->c+e);

                        
                long start = System.currentTimeMillis();  // it will give the time from 1970s 
                // thats where the unix Epoch came 
                         int sum1 = num.stream()
                        .map(i -> {
                            try{
                                Thread.sleep(1);
                            }
                            catch(Exception e){

                            }
                           return  i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
                        long end = System.currentTimeMillis();

                        long start1 = System.currentTimeMillis();
                         int sum2 = num.parallelStream()  // ParallelStream is used to execute threads 
                        .map(i -> i*2)
                        .mapToInt(i -> i)
                        .sum();
                          long end1 = System.currentTimeMillis();

                        System.out.println(sum +" : " + sum1 +" : " + sum2);
                        System.out.println(" delay :" +( end - start));
                        System.out.println("delay : " + (end1 - start1));
    }
}
