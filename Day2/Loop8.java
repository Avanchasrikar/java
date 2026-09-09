public class Loop8 {
    public static void main(String[] args) {
            int n = 12345;
        int count = 0;
//Count the digits numberof a 
        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);
    }
    }

