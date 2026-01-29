package corePrograms.javaProgrammingelements.level1;

/*
 Program to convert kilometers to miles
 using user input
*/
import java.util.Scanner;

class KmToMilesInput {

    // main method execution starts here
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km = input.nextDouble();
        double miles = km / 1.6;

        System.out.println(
                "The total miles is " + miles + " mile for the given " + km + " km"
        );
    }
}