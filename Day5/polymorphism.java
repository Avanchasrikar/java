

// we are doing run time polymorphism  using dynamic Method dipatch... 

//Creating separate objects is fine when you know exactly which class you need;
//  polymorphism is useful when your code should 
// work with multiple related classes through one common interface/parent type.
class a{
    public void show(){
        System.out.println("show A");
    }
}
class b extends a{
    public void show(){
        System.out.println("show B");
    }
}
class c extends a{
    public void show(){
        System.out.println("show C");
    }
}

public class polymorphism {

     
    public static void main(String[] args) {
        // polymorphism is that which contain many behaviours 
        // there are two types in polymorphism 1) compile time polymorphism or early Binding
        // 2) run time polymorphism or late Binding

        // now we have created a reference of a superclass and the object of a subclass 
        // reference is same for all the subclass..
        
        a obj =new b();
        obj.show();

        obj =new a();
        obj.show();

        obj =new c();
        obj.show();

    }
    
}
