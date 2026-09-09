public class Loop12 {
    public static void main(String[] args) {
        int n= 1232;
        int comp=0;
        //Find the largest digit in a number
        for(;n!=0;n/=10){
            int digit=n%10;
            if(digit>comp){
                comp=digit;
            }
        }System.out.println(comp);
    }
}
