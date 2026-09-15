public class Abstract {
    public static void main(String[] args) {
        Car  obj = new updatedaudi(); // we can't create a object of a abstract class 
            obj.dirve();
            obj.Music();
            obj.fly();
            
        
        
    }
}
// You can write a method once in the abstract class, and
//  all child classes will automatically inherit it. 
// This saves you from rewriting the same code over and over again
abstract class Car{
    public abstract void dirve();
    public abstract void fly();
    public void Music(){
        System.out.println("playing music");
    } 

}
abstract class audi extends Car{
    public void dirve()
    {
        System.out.println("driving........");
    }   

}
class updatedaudi extends audi{ // concrete class 
    public void fly(){
        System.out.println("flying flying flying.....");
    }



}