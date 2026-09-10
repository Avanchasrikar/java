class Mobile{
    static String phone;
    String type;
    int price;

    static{ 
        // static block which will not be called multipule times like constructor for 
    // every new object creaction
    phone ="samsung";
    System.out.println("static");

    }
    public Mobile(){
         price =200;
        type = "phone";
        System.out.println("not static");
    }
}
public class staticBlock {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
         Mobile obj1 = new Mobile();
         

        
    }
}
