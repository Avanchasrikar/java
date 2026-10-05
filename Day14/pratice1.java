
class Cal{
    public int  add(int a , int b){
        return a + b;
    }
    public  int add(int a , int b ,int c){
        return a+b+c;
    }
    public double add(double a , double b){
        return a +b;
    }
}

public class pratice1{
    public static void main(String[] args) {
        Cal obj = new Cal();
       int r1 = obj.add(2, 2);
     double r2 =   obj.add(2,2);
     int r3 =  obj.add(5, 5);

        System.out.println(r1 + ":" + r2 +":" + r3);


    }
}