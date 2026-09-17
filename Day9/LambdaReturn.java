// Lambda  Expression with return type
interface A{
    int add(int i , int j);
}
public class LambdaReturn {
    public static void main(String[] args) {
        A obj = (i,j) -> {
            return i+j;
        };
        int result = obj.add(2, 3);
        System.out.println(result);

    }
    
}
