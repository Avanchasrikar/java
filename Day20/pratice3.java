
class Employee {
    int employeeId;
    String name;
    double basicSalary;

    // Calculate HRA (20% of basic salary)
    public double calculateHRA() {
        return basicSalary * 0.20;
    }

    // Calculate DA (10% of basic salary)
    public double calculateDA() {
        return basicSalary * 0.10;
    }

    // Calculate gross salary
    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class pratice3 {
    public static void main(String[] args) {

        // Create three employee objects
        Employee emp1 = new Employee();
        emp1.employeeId = 101;
        emp1.name = "Ravi";
        emp1.basicSalary = 30000.0;

        Employee emp2 = new Employee();
        emp2.employeeId = 102;
        emp2.name = "Anu";
        emp2.basicSalary = 40000.0;

        Employee emp3 = new Employee();
        emp3.employeeId = 103;
        emp3.name = "Rahul";
        emp3.basicSalary = 25000.0;

        // Store objects in an array
        Employee[] employees = {emp1, emp2, emp3};

        double totalGrossSalary = 0;
        Employee highestPaid = employees[0];

        // Display details and find highest-paid employee
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("--------------------");

            double gross = emp.calculateGrossSalary();
            totalGrossSalary += gross;

            if (gross > highestPaid.calculateGrossSalary()) {
                highestPaid = emp;
            }
        }

        // Calculate average gross salary
        double average = totalGrossSalary / employees.length;

        System.out.println("\nHighest-Paid Employee:");
        System.out.println("Name: " + highestPaid.name);
        System.out.println("Gross Salary: "
                + highestPaid.calculateGrossSalary());

        System.out.println("\nAverage Gross Salary: " + average);
    }
}
