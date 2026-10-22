class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;


    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
            System.out.println("Depositing: " + amount);
            System.out.println("Balance after deposit: " + balance);
        }
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawing: " + amount);
            System.out.println("Balance after withdrawal: " + balance);
        }
    }
}

public class praticeclasses {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.accountHolder = "Ravi";
        obj1.accountNumber = 1001;
        obj1.balance = 5000.0;

        BankAccount obj2 = new BankAccount();
        obj2.accountHolder = "Priya";
        obj2.accountNumber = 1002;
        obj2.balance = 3000.0;

        obj1.displayDetails();
        System.out.println();

        obj1.deposit(1000.0);
        System.out.println();

        obj1.withdraw(2000.0);
        System.out.println();

       
        obj2.displayDetails();
    }
}