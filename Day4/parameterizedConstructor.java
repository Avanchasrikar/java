class car{
    private int modelnum;
    private String carname;

   
    public car(){ // default constructor 
        modelnum = 21;
        carname ="audi";
    }
    // The main use of a parameterized constructor is to initialize a new 
    // object with specific, custom values right at the moment it is created
    public car(int modelnum,String carname){  // parameterized constructor
        this.modelnum=modelnum;
        this.carname = carname;
    }

	public int getModelnum() {
		return modelnum;
	}
	public void setModelnum(int modelnum) {
		this.modelnum = modelnum;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
    
}


public class parameterizedConstructor {
    public static void main(String[] args) {

           car obj =new car();
           car obj1 = new car(6,"cars");
        obj.setModelnum(101);
        obj.setCarname("audi");
       System.out.println(obj1.getCarname() + " : " + obj1.getModelnum());

        
    }
    
}
