class Product{
    private int productId;
    private String productName;
    private double price;
    public Product() {
        productId = 0;
        productName = "Unknown";
        price = 0.0;
    }
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
   
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
     public void displayDetails()
    {
    System.out.println("Product ID: " + productId);
    System.out.println("Product Name: " + productName);
    System.out.println("Price: " + price);
    }
    
   
}
public class praticeConstructors {
    public static void main(String[] args) {

        Product obj = new Product();
        Product obj1 = new Product();

        // System.out.println("Product ID: " +obj.getProductId() +"\n" +"Product Name: " + obj.getProductName() + " \n" + "Price:"+ obj.getPrice());
      
        obj1.setProductId(101);
        obj1.setProductName("Keyboard");
        obj1.setPrice(1499.0);
       
       obj.displayDetails();

        obj1.displayDetails();



    }
}
