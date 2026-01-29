package corePrograms.methods.level1;

import java.util.Scanner;

/*
 Program to calculate maximum handshakes using combination formula
*/
class HandshakesMethod {

    // method to calculate handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.println("Maximum handshakes = " + calculateHandshakes(n));
    }
}

