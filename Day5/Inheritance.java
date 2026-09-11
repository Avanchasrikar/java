

public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r = obj.add(5,6);
        int r1 = obj.sub(4,2);
        int r2 = obj.divid(4,4);
        int r3 = obj.multi(2, 2);
        int r4 = (int)obj.power(3, 3);
         System.out.println(r + " :" + r1+ ":"+ r2 + ": " + r3 + ":" + r4);
    }
}
// there is no Multiple inheritance becouse of Ambiguity    so java dont support multiple inher