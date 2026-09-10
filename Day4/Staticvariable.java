class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand + ":" + brand+ " price :" + price + "name :" + name);
    }
}
public class Staticvariable {
    public static void main(String[] args) {
        // static keyword means it belong to class not object 
        Mobile obj =new Mobile();
        obj.brand="apple";
        obj.price=200;
        obj.name="phone";  // obj. bad pratice
        // when we use static variable we use class instade of object reference 

        // even we can call it with object  also but best to call it with class names  

         Mobile obj1 =new Mobile();
        obj1.brand="apple";
        obj1.price=200;
        Mobile.name="phone";   // Mobile. is good pratice 

        

        obj.show();
        obj1.show();
        

    }
 
    
}