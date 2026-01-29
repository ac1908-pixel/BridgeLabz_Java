package corePrograms.javaProgrammingelements.level1;

/*
 Program to calculate discounted fee
 using user input
*/
import java.util.Scanner;

class FeeDiscountInput {

    // main method execution starts here
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println(
                "The discount amount is INR " + discount +
                        " and final discounted fee is INR " + finalFee
        );
    }
}