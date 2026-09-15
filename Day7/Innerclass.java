class A{
    public void show(){
        System.out.println("show");
    }

    static class B{
        public void config(){
            System.out.println("config");
        }
    }
}
public class Innerclass {
    public static void main(String[] args) {
       A obj = new A();
       obj.show();

       // B is a part of class A so we need to use reference of A
       // if we make inner class static no need to take reference 


        A.B obj1 = new A.B(); 
       
    //    A.B obj1 = obj.new B();
       obj1.config();
    }
    
}
