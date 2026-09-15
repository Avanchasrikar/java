// class to class => extends
//class to interface => implements
// interface to interface => extends
interface A{

    int age=21; // every variable in the interface is final and static 
    // because there are static no need to use object we can call them directly
    String area = "Mumbai";
    void show();
    void config();
}
interface F{
    void what();
}
interface Y extends F{ 

}
class B implements A,Y{ // one class can implement multiple interfaces
    public void show(){
        System.out.println("show");
    }
    public void config(){
        System.out.println("config");
    }
    public void what(){
        System.out.println("what is this");
    }
}

public class Interface1 {
    public static void main(String[] args) {

        A obj = new B();
        obj.config();
        obj.show();
        System.out.println(A.age); // static 
        
    }
}
