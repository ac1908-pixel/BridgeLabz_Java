package objectOrientedProgramming.objectModelling;

import java.util.ArrayList;

/*
 * Account class
 * -------------
 * Represents a bank account.
 * An account is associated with both a Customer and a Bank.
 * This class helps demonstrate association.
 */
class Account {

    private int accountNumber;
    private double balance;
    private Bank bank;

    /*
     * Constructor to initialize account details
     */
    public Account(int accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0.0;
    }

    /*
     * Method to deposit money into the account
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /*
     * Method to return the current account balance
     */
    public double getBalance() {
        return balance;
    }

    /*
     * Method to return bank name
     */
    public String getBankName() {
        return bank.getBankName();
    }
}

/*
 * Customer class
 * --------------
 * Represents a bank customer.
 * A customer can have multiple bank accounts.
 * Customer communicates with Account to view balance.
 */
class Customer {

    private String name;
    private ArrayList<Account> accounts;

    /*
     * Constructor to initialize customer name
     */
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    /*
     * Method to add a new account to the customer
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }

    /*
     * Method to view balances of all accounts
     */
    public void viewBalance() {
        System.out.println("Account details for " + name + ":");

        // Loop through all accounts and display balance
        for (Account account : accounts) {
            System.out.println(
                    "Bank: " + account.getBankName() +
                            ", Balance: ₹" + account.getBalance()
            );
        }
    }
}

/*
 * Bank class
 * ----------
 * Represents a Bank entity.
 * A Bank can have multiple customers.
 * Bank opens accounts for customers.
 */
class Bank {

    private String bankName;
    private ArrayList<Account> accounts;

    /*
     * Constructor to initialize bank name
     */
    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    /*
     * Method to open a new account for a customer
     */
    public Account openAccount(Customer customer, int accountNumber) {
        Account account = new Account(accountNumber, this);

        // Add account to bank records
        accounts.add(account);

        // Associate account with customer
        customer.addAccount(account);

        return account;
    }

    /*
     * Method to return bank name
     */
    public String getBankName() {
        return bankName;
    }
}

/*
 * Main class
 * ----------
 * Demonstrates association between Bank and Customer
 */
public class AssociationDemo {

    public static void main(String[] args) {

        // Creating bank object
        Bank sbi = new Bank("State Bank of India");

        // Creating customer objects
        Customer alok = new Customer("Alok");
        Customer rahul = new Customer("Rahul");

        // Opening accounts for customers
        Account acc1 = sbi.openAccount(alok, 101);
        Account acc2 = sbi.openAccount(alok, 102);
        Account acc3 = sbi.openAccount(rahul, 201);

        // Depositing money
        acc1.deposit(5000);
        acc2.deposit(12000);
        acc3.deposit(8000);

        // Customers viewing their balances
        alok.viewBalance();
        System.out.println();
        rahul.viewBalance();
    }
}

