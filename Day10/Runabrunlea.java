// class A implements Runnable{
//    public  void run(){
//         for(int i = 0; i<=3;i++){
//             System.out.println("hello");
//         }
//     }
// }
// class B implements Runnable{
//   public   void run(){
//         for(int i = 0; i<=3;i++){
//             System.out.println("hi");
//         }
//     }
// }
public class Runabrunlea {
    public static void main(String[] args) {
        Runnable  obj = () -> {
        for(int i = 0; i<=3;i++){
            System.out.println("hello");
        }
    };
        Runnable obj1 = () -> {
        for(int i = 0; i<=3;i++){
            System.out.println("hi");
        }
    };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
    
}
   