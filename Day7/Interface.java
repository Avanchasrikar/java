interface Computer{
    void code();
    
}
class Laptop implements  Computer{
    public void code(){
        System.out.println("code , dbug, run");
    }

}
class Desktop implements  Computer{
    public void code(){
        System.out.println("code , dbug, run : faster");

    }
}
class Developer{
    public void devapp(Computer lap){  // we have passed a object here 

        lap.code();

    }

}
public class Interface {
    public static void main(String[] args) {

        Computer desc = new Desktop();
        Computer lap = new Laptop();
        

        Developer obj2 =new  Developer();
        obj2.devapp(desc);

        
    }
}

// 

// abstract class Computer{
//     public abstract void code();
    
// }
// class Laptop extends Computer{
//     public void code(){
//         System.out.println("code , dbug, run");
//     }

// }
// class Desktop extends Computer{
//     public void code(){
//         System.out.println("code , dbug, run : faster");

//     }
// }
// class Developer{
//     public void devapp(Computer lap){  // we have passed a object here 


//     }

// }
// public class Interface {
//     public static void main(String[] args) {

//         Computer desc = new Desktop();
//         Computer lap = new Laptop();
        

//         Developer obj2 =new  Developer();
//         obj2.devapp(desc);

        
//     }
// }
