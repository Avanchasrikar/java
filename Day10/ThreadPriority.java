class A extends Thread{
   public  void run(){
        for(int i = 0; i<=100;i++){
            System.out.println("hello");
           try{
             Thread.sleep(10);
           }catch(Exception e){
            e.printStackTrace();
           }
        }
    }
}
class B extends Thread{
  public   void run(){
        for(int i = 0; i<=100;i++){
            System.out.println("hi");
        }
         try{
             Thread.sleep(10);
           }catch(Exception e){
            e.printStackTrace();
           }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {

        A obj = new A();
        B obj1 = new B();

       

        // obj.setPriority(Thread.MAX_PRIORITY);  /// imp
         System.out.println(obj.getPriority());

        obj.start();
         try{
             Thread.sleep(2);
           }catch(Exception e){
            e.printStackTrace();
           }
        obj1.start();
    }
}
