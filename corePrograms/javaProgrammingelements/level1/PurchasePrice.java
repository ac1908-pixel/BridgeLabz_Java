package corePrograms.javaProgrammingelements.level1;

/*
 Program to calculate total purchase price
*/
import java.util.Scanner;

class PurchasePrice {

    // main method execution starts here
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println(
                "The total purchase price is INR " + totalPrice +
                        " if the quantity " + quantity +
                        " and unit price is INR " + unitPrice
        );
    }
}
