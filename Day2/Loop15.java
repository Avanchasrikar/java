public class Loop15 {
   public static void main(String[] args) {
    int n =500;
   
    for(int i=1;i<=n;i++){
        // System.out.println(i);
         double result =0;
        int temp = i;
        for(;temp!=0;temp/=10){
            int digit= temp%10;
            result = result + Math.pow(digit,3);
        }
        if (i==result) {
        System.out.println(i);
        
    }
    }
    
   } 
}
