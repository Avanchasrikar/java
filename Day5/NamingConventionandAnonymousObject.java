class A{
    public void show(){
        System.out.println("new object");
    }
}

public class NamingConventionandAnonymousObject  {
    public static void main(String[] args) {
        // instade of creating creating a reference to a object is know as a AnonymousObject
        new A().show(); // AnonymousObject
        new A().show(); // AnonymousObject 
        // becouse of this we can can't use same object multipule time 
        // every new word creates a new object 
        
    }
    
}

// Camel casing
//class and interfaces  - Calculater , Runable 
//variable and method - marks , show()
// constant - PI , BRAND 

