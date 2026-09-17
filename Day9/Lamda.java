@FunctionalInterface 
interface A{
    void show(int i);

}
public class Lamda {
    public static void main(String[] args) {
        // we are using  Lambda expression 
        A obj = (i) -> System.out.println("hello this Lambda expression" + i);
        obj.show(7);
    }

    
}
