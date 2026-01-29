package corePrograms.javaProgrammingelements.level2;

/*
 Program to convert pounds to kilograms
*/
import java.util.Scanner;

class PoundToKg {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pounds = input.nextDouble();
        double kilograms = pounds / 2.2;

        System.out.println(
                "The weight of the person in pound is " +
                        pounds + " and in kg is " + kilograms
        );
    }
}

