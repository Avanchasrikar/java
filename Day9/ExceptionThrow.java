public class ExceptionThrow {
    public static void main(String[] args) {
         int a =20;
        int j =0;

        try
        {
            j = 9/a;
            if(j == 0){
                throw new ArithmeticException();  // we have created a object over here 
            }
        }
        catch(Exception e){
            j=18/1;
            System.out.println("some thing went wrong......");
        }
        System.out.println(j);

        System.out.println("hello");
    }
}
