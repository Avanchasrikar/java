//2. Find the maximum of three numbers
// Intermediate

// Create a method `findMax()` that accepts three integers and returns the largest.
//  Do not use arrays or built-in maximum functions.Input: 12, 45, 27
// Output: 45

class largest{
    public int findMax(int a , int b , int c){

        if(a > b && a > c){
            return a;
        }else if (b>c && b>a) {
            return b;
        }else{
            return c;
        }

    }
}
public class pratice2 {
    public static void main(String[] args) {
        largest lg = new largest();
    int result =    lg.findMax(2, 0, 4);
        System.out.println(result);
    }
}
