class Loop14{
    public static void main(String[] args) {
        int n = 153;
        double result =0;
        for(;n!=0;n/=10){
            int digit = n%10;
            result= result + Math.pow(digit,3);
        }System.out.println((int)result);
    }
}