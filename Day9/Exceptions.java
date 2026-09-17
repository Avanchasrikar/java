

public class Exceptions {
    public static void main(String[] args) {
        int a =0;
        int j =0;

        try
        {
            j = 9/a;
        }
        catch(Exception e){
            System.out.println("some thing went wrong......");
        }
        System.out.println(j);

        System.out.println("hello");
    }
}
