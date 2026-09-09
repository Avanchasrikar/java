public class Loop11 {
    public static void main(String[] args) {
           int n = 121;
        int original = n;
        int reverse = 0;

        for (; n != 0; n /= 10) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
   
  
}
