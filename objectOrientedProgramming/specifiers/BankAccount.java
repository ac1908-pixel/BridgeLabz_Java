package objectOrientedProgramming.specifiers;

import java.util.Random;

/*
 * BankAccount class demonstrates:
 * - static variables
 * - final variables
 * - constructors
 * - instance vs class members
 */
public class BankAccount {

    // Static variables shared across all objects
    static String bankName = "BridgeLabz Bank";
    static int numberOfAccounts = 0;

    // Instance variables
    String accountHolderName;

    // Final variable (cannot be changed once assigned)
    final long accountNumber;

    /*
     * Constructor
     * Initializes account holder name and generates account number
     * Also increments total number of accounts
     */
    BankAccount(String accountHolderName) {
        Random r = new Random();
        this.accountHolderName = accountHolderName;

        // Generates a 9-digit account number
        this.accountNumber = 100000000L + r.nextInt(900000000);

        // Increment static account counter
        numberOfAccounts++;
    }

    /*
     * Returns total number of BankAccount objects created
     */
    public static int getTotalAccounts() {
        return numberOfAccounts;
    }

    /*
     * Displays account details
     */
    public void displayAccountDetails() {
        System.out.println("Bank Name        : " + bankName);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Account Number   : " + accountNumber);
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Alok");
        BankAccount acc2 = new BankAccount("Rahul");

        acc1.displayAccountDetails();
        System.out.println();

        acc2.displayAccountDetails();
        System.out.println();

        // Access static method using class name
        System.out.println("Total Accounts Created: " + BankAccount.getTotalAccounts());
    }
}
