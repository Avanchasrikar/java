class A  extends Object  { //  it is common weater we extend  object or not not 

    // every constructor contains a super method but if we want to do changes we can use it like 
     public A(){
        super();
        System.out.println("in A");
     }
     public A(int n){
        super();
        System.out.println("in int A");
     }
}
// as we know super class for B is A even thow we create a object for class be it will call 
//construtor of class A Defalut constructor if i want to call parameterized constructor 
// then i need to use super Method 
class B extends A{
    public B(){
        super(4);
        System.out.println("in B");
     }
     public B(int n){
        // this will execute the constructor of same class that us   public B() 
        // and that is calling the constructor of it's super class A
        this();
        System.out.println("in int B");
     }

}
public class SuperMethod {
    public static void main(String[] args) {
        // by passing the value in boject i am telling that to call parameterized constructor 
        // what if i want to use Default constructor also we need to use this function 
        // 
        B obj = new B(5);
    }
    
}
