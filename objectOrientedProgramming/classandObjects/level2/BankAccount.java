package objectOrientedProgramming.classandObjects.level2;

/*
 Program to simulate basic ATM operations
*/
class BankAccount {

    // attributes of BankAccount
    String accountHolder;
    int accountNumber;
    double balance;

    // constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // method to withdraw money if balance is sufficient
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // method to display current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // main method
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi", 12345, 5000);
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}
