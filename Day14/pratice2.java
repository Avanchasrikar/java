class Printer{
    public  String text(String  a){
        return a;
    }
    public int text(int b){
        return b;
    }
}

public class pratice2 {
    public static void main(String[] args) {
        Printer obj = new Printer();
        
       

        for(int i =0 ; i <=obj.text(2);i++){
            System.out.println(obj.text("java"));
        }
    }
}
