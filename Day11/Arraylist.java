import java.util.Arrays;
import java.util.List;

//  for ArrayList, HashSet, HashMap we use list.size() 
// for String, StringBuilder, StringBuffer we use str.length()
// for Primitive & Object Arrays (int[], String[], etc.) we use arr.length
public class Arraylist {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,4,5,6);
        //method 1
        for(int i=0;i<num.size();i++){
            System.out.println(num.get(i));
        }
        // Method 2
        for(int n : num){
            System.out.println(n);
        }
        // method 3 for each is a part of list interface 
        num.forEach(n -> System.out.println(n));


        // Method 4
        int sum =0;
        for(int n: num){

        if(n%2==0){
        n=n*2;
        sum = sum + n ;
        }

        }
        System.out.println(sum);
    }
}
