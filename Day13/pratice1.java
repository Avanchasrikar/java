// Calculate the square
//Basic
//Write a method named `square()` that accepts an integer and returns its square. 
// Call it from `main()` and print the result.
class Calculate{
    public int square(int n )
    {
        return n*n;
    }
}

public class pratice1{
    public static void main(String[] args) {
        Calculate sq = new Calculate();
     int result =   sq.square(5);
        System.out.println(result);
    }
}