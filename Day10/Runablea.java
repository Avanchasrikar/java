class A implements Readable{
   public  void run(){
        for(int i = 0; i<=3;i++){
            System.out.println("hello");
        }
    }
}
class B implements Readable{
  public   void run(){
        for(int i = 0; i<=3;i++){
            System.out.println("hi");
        }
    }
}
public class Runablea {
    public static void main(String[] args) {
           obj = new A();
        B obj1 = new B();
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();
    }
    
}
