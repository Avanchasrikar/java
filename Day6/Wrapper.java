
public class Wrapper {
    public static void main(String[] args) {
        int num = 9;
        // This concept is called boxing because you can take primitive value 
        // and store in primitive object thst is called boxing

        // Integer num1 = new Integer(num); // boxing 
        Integer num1 = num;  // Autoboxing
//unboing is nothing but taking out the value primitive  value from the object
        int num2 = num1.intValue(); // unboxing 


        // int num2 = num; //auto-unboxing


        System.out.println(num1);

        // conver the String into integer and store's it into int
        String str = "23";
        int num3 = Integer.parseInt(str); // String => integer => int 
        System.out.println(num3*2);
    }
    
}
