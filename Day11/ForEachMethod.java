import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachMethod {
    public static void main(String[] args) {
        // for each method takes an a object of consumer
        //  consumer interface is also know as a functional interface so we can use lambda expresion 
        List<Integer> nums =  Arrays.asList(2,4,5,7,9,8);
        // Method 1 we are using reference of consumer
        Consumer<Integer> con = n ->   System.out.println(n);
        nums.forEach(con);
        // Method 2 we will not use the reference of  consumer . foreach helps to reduce the code size..

        nums.forEach( n ->   System.out.println(n)); 
        

        

    }
}
// just for reference 
//  Consumer<Integer> con = new Consumer<Integer>(){
//             public void accept(Integer n){
//                 System.out.println(n);
//             }