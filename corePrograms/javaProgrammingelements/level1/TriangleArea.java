package corePrograms.javaProgrammingelements.level1;

/*
 Program to calculate area of a triangle
*/
import java.util.Scanner;

class TriangleArea {

    // main method execution starts here
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of triangle is " + area);
    }
}


