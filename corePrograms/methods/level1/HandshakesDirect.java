package corePrograms.methods.level1;

import java.util.Scanner;

/*
 Program to calculate maximum handshakes directly
*/
class HandshakesDirect {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum handshakes = " + handshakes);
    }
}

