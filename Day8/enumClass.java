enum Laptop{
    samsung(2000),Apple(),Mango(3000),Dell(550);

   private int price;

   private Laptop(){
    price = 40;
   }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
}
public class enumClass {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Apple;

        for(Laptop lap : Laptop.values()){
            System.out.println(lap +" :"+ lap.getPrice());
        }
    }
}
