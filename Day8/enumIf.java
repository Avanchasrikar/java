enum status{ // status is a class
    Running,Failed,Pending,Success; // these are objects
}

public class enumIf {
     public static void main(String[] args) {
        status s = status.Pending;

        if(s==status.Running){
            System.out.println("all good");
        }else if(s == status.Success){
            System.out.println("working");
        }else if(s == status.Failed){
            System.out.println("not working");
        }else{
            System.out.println("in process");
        }

       
    }
}
