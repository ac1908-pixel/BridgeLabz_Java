package objectOrientedProgramming.inheritance;

class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Common method
    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Specific behavior
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    // Constructor
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Specific behavior
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Daily Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int lockInPeriod; // in months

    // Constructor
    FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    // Specific behavior
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }
}

public class BankTest {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(
                "SAV-101", 50000, 4.5);

        CheckingAccount checking = new CheckingAccount(
                "CHK-202", 30000, 20000);

        FixedDepositAccount fd = new FixedDepositAccount(
                "FD-303", 100000, 24);

        System.out.println("---- Savings Account ----");
        savings.displayAccountType();
        savings.displayBalance();

        System.out.println("\n---- Checking Account ----");
        checking.displayAccountType();
        checking.displayBalance();

        System.out.println("\n---- Fixed Deposit Account ----");
        fd.displayAccountType();
        fd.displayBalance();
    }
}
