package corePrograms.javaProgrammingelements.level1;

/*
 Program to convert feet to yards and miles
*/
import java.util.Scanner;

class FeetConversion {

    // main method execution starts here
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println(
                "Distance in feet is " + feet +
                        ", in yards is " + yards +
                        " and in miles is " + miles
        );
    }
}
