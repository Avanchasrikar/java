import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {

        // Java Generics work only with reference types, not primitive types. s we cant take int 
        List<Integer> nums  =  new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(7);

        System.out.println(nums.indexOf(2));

        System.out.println(nums.get(2));

       for(int n :nums){
        System.out.println(n);
       }
    }
    
}
