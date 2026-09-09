public class Loop7 {
    public static void main(String[] args) {
        //Find factorial of N
        //ex-5! = 5 × 4 × 3 × 2 × 1 = 120
        int n=5;
        int mul=1;
       
        for(int i=n;i>=1;i--){
            
            mul *=i;
           
        }

       System.out.println(mul);

      
    }
}
