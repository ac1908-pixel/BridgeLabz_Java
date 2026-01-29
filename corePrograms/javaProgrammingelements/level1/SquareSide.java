package corePrograms.javaProgrammingelements.level1;

/*
 Program to find side of square
 from perimeter
*/
import java.util.Scanner;

class SquareSide {

    // main method execution starts here
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double perimeter = input.nextDouble();
        double side = perimeter / 4;

        System.out.println(
                "The length of the side is " + side +
                        " whose perimeter is " + perimeter
        );
    }
}