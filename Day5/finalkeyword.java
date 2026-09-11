final class A{ // by adding final we can extend class A

    // even we can make method final so that anyone can't override
    public final void show(){
        System.out.println("show ");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }


}
// class B extends A{
//     public final void show(){
//         System.out.println("show ");
//     }
// }
public class finalkeyword {
    public static void main(String[] args) {
    // final keyword denotes that it is a constant(means we can't change it )

    //final - variable ,method ,class

    final int n = 8;
    // n =9;  if we try to change we will get erreor
    System.out.println(n);     
        
        A obj = new A();
        obj.show();
        obj.add(2, 3);
        
    }
    
}
