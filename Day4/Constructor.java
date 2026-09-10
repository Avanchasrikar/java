class car{
    private int modelnum;
    private String carname;

    // every time we create a object constructor is called automaticaly 
    // every time you create a  new object  it calles constructor 
    // we can consider constructors  are used to show defalut values.
    // constructor contains same name as class name 

    public car(){ // default constructor 
        modelnum = 21;
        carname ="audi";
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

public class Constructor {
    public static void main(String[] args) {

        car obj =new car();
        obj.setModelnum(101);
        obj.setCarname("audi");


        
    }
    
}
