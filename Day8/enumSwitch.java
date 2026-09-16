enum status{
   Running,Failed,Pending,Success;
}
public class enumSwitch {

    public static void main(String[] args) {
        
        status ss = status.Success;

        switch (ss) {
            case Running:
                System.out.println("loading");
                break;

                case Failed:
                System.out.println("not working");
                break;

                case Pending:
                System.out.println("in process");
                break;

        
            default:
                System.out.println("you are in");
                break;
        }

    }
    
}
