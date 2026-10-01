// 3. Check whether a number is prime
//Advanced

//Create a method `isPrime()` that accepts an integer and returns a boolean. 
// Call it for several numbers in `main()` and print whether each is prime.Input: 7
//Output: true

class find{
    public boolean isPrime(int a){
        if(a < 2){
            return false;
        }
        for(int i =2; i*i <=a;i++){
            if(a % i ==0){
                return false;
            }
        }
            return true;
        
    }
}

public class pratice3 {
        public static void main(String[] args) {
            find pr = new find();
         boolean result = pr.isPrime(7);
         System.out.println(result);
          
        }
}
