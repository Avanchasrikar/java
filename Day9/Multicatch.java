package Day9;
public class Multicatch {
    public static void main(String[] args) {
        int a= 2;
        int j;
        String b =null;
        int num[] = new int[5];

        try
        {
            j = 9/a;
            System.out.println(num[2]);
            System.out.println(b.length());
        }
        catch(ArithmeticException e){
            System.out.println("not divisable by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println("out of Boundry");
        }
        catch(Exception e){  // this a parent class Exception which need to be at last because it can handle every thing
            System.out.println("some thing went wrong");
        }
        
    }
}
