class Calculate{
  
 public  int add(int a,int b){
    System.out.println(a+b);
    return 1;
 }
}
public class CandO{
public static void main(String[] args) {
    Calculate cal =new Calculate(); // object 

    // cal is a reference of class Calculate

    cal.add(10, 2);

}
    
}
