import java.util.Set;
import java.util.TreeSet;


public class SetHash {

    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<>();
        // if we want sorted set we must use Treeset
        Set<Integer> nums = new TreeSet<>();
         nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(7);

         for(int n :nums){
        System.out.println(n);
       }
    }
}