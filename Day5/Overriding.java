class calc{
    public int add(int a , int b){
        return a+b;
    }
    
}
class AdvCalc extends calc{
    public int add(int a, int b){
        return a+b+1;
     // this is overriding same method name ,same datatype but with different behavior 
    }
}
public class Overriding {
    public static void main(String[] args) {
        AdvCalc obj =new AdvCalc();
       int r1 = obj.add(3, 3);
       System.out.println(r1);
    }
}
