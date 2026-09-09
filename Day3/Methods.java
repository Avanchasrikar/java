class cal{
   public void music(){
    System.out.println("playing music ");
   }
   public String getpen(int cost){
    if(cost<=10){
        return "take it ";
    }
    return "pen";
   }
}

public class Methods {
    public static void main(String[] args) {

        cal obj =new cal();
        obj.music();
     String str=   obj.getpen(5);
     System.out.println(str);
        
    }
}
