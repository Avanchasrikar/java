class Human{


    private int age;
private String name;

    public  int getage(){
        return age;
    }
    public  void setage(int a){
        age = a ;
    }
    public  String getname(){
        return name;
    }
    public  void setname(String n){
        name=n;
    }
}
public class Encapsulation {
    public static void main(String[] args) {

        // we are binding your data
        // Encapsulation is nothing but hidding the data
        //  To protect data from being accidentally changed or misused.
         
        Human obj = new Human();
        obj.setage(9);
        obj.setname("srikar");

        System.out.println(obj.getage() + ": " + obj.getname());

    }
}
