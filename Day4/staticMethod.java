class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println("brand :" + brand+ " price :" + price + " name :" + name);
    }
    
    // disadvantage of static method is that we can't use static variable in static method 
    // directly we can use it by using object reference. 
    public static void show1(Mobile obj){
       System.out.println("brand :" + obj.brand+ " price :" + obj.price + " name :" + name);
    }
}
public class staticMethod {
    public static void main(String[] args) {

         Mobile obj =new Mobile();
        obj.brand="apple";
        obj.price=200;
        Mobile.name="phone";  

         Mobile obj1 =new Mobile();
        obj1.brand="Samsung";
        obj1.price=1230;
        Mobile.name="phone";  
        

        obj.show();
        obj1.show();
 //advantage of static method is that 
        // we can call static method without creating a object  directly...
        //we need to call over also the reference of object
        Mobile.show1(obj);  
    }
}
