class A{
    public void show(){
        System.out.println("this is methos");
    }
}

public class AnonymousInner {
    public static void main(String[] args) {

        //An anonymous inner class in Java is a special kind of hidden class that 
        // lets you declare and create an object at the very same time. 
        // It is called "anonymous" because it has no name,
        //  and "inner" because it is written inside another class

        A obj = new A(){
              public void show()
              {
        System.out.println("this is  AnonymousInner ");
              }
                };
obj.show();

        }
        
    }

