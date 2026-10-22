class Employee{
    int employeeId;
    String name;
    double basicSalary;
    double value;
    double value1;
    public double HRA(int per )
    {
       return  basicSalary * (per / 100.0);
        
    }

    public double DA(int da )
    {
     return basicSalary * (da / 100.0);
     
    }

    public double gross(){
        
      return  basicSalary + DA(10)+ HRA(20);
    }
   
}
public class pratice2 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.name = "ravi";
        obj.basicSalary = 30000.0;
        obj.employeeId = 101;


       

        System.out.println("Employee ID:" + obj.employeeId );
        System.out.println("Name :" +obj.name);
        System.out.println("Basic Salary:" + obj.basicSalary);
        System.out.println("HRA:" + obj.HRA(20) );
         System.out.println("DA: " + obj.DA(10));
       System.out.println("Gross Salary: " + obj.gross());





    }
}
