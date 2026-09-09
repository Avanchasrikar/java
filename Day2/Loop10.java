public class Loop10 {
    public static void main(String[] args) {
        int n = 12345;
        int re=0;
        //Reverse a number
        while (n!=0) {
            int digit = n%10;
           re = re * 10 + digit;
            n=n/10;
        }
        System.out.println(re);
    
    }
}
