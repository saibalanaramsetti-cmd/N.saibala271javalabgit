class Account {

    protected int accountNumber;
    protected String name;
    protected double balance;

    // Constructor
    Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Display account details
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Balance: ₹" + balance);
    }

    // Deposit function
    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("₹" + amount + " deposited successfully.");
            System.out.println( "Current Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw function
    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            balance = balance - amount;

            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("Current Balance: ₹" + balance);
        }
    }
    // Interest
    void calculateInterest() {
        System.out.println("General account interest");
    }
}


// Savings Account
class SavingsAccount extends Account {

    SavingsAccount(int accountNumber,
                   String name,
                   double balance) {

        super(accountNumber, name, balance);
    }

    @Override
    void calculateInterest() {

        System.out.println(
            "Savings Account Interest: ₹" +
            (balance * 0.04)
        );
    }
}


// Current Account
class CurrentAccount extends Account {

    CurrentAccount(int accountNumber,
                   String name,
                   double balance) {

        super(accountNumber, name, balance);
    }

    @Override
    void calculateInterest() {

        System.out.println(
            "Current Account Interest: ₹" +
            (balance * 0.02)
        );
    }
}


// Main class
public class BankDemo {

    public static void main(String[] args) {

        Account a1 =
            new SavingsAccount(
                101,
                "Dileep",
                10000
            );

        System.out.println("----- ACCOUNT DETAILS -----");

        a1.display();

        System.out.println("\n----- DEPOSIT -----");

        a1.deposit(5000);

        System.out.println("\n----- WITHDRAW -----");

        a1.withdraw(3000);

        System.out.println("\n----- INTEREST -----");

        a1.calculateInterest();

        System.out.println("\n----- FINAL DETAILS -----");

        a1.display();
    }
}