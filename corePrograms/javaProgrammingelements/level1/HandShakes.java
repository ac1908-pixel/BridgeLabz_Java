package corePrograms.javaProgrammingelements.level1;

/*
 Program to calculate maximum number
 of handshakes
*/
import java.util.Scanner;

class Handshakes {

    // main method execution starts here
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}