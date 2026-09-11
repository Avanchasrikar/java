class A{
    public void show(){
        System.out.println("show A");
    }

}
class B extends A{
    public void show1(){
        System.out.println("show B");
    }

}

public class upCasting {
    public static void main(String[] args) {
        A obj = new B(); // upcasting 
        obj.show();
        

        B obj1 = (B) obj; // Downcasting
        obj1.show1(); 
    }
    
}
