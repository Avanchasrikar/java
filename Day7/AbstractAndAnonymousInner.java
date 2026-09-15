abstract class A{
    public abstract void show();
}


public class AbstractAndAnonymousInner {
    public static void main(String[] args) {

        // over here it does't mean that we are creating object of abstract class A.
        // we are creating object of AnonymousInner class 
        A obj = new A(){
            
            public void show() {
                System.out.println("this is show ");
            }
        };
obj.show();
    }
}
