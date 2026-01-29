package corePrograms.inbuiltfunctions;

import java.util.Scanner;

/*
 Program to find factorial using recursion
*/
class Factorial {

    // recursive method
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial: " + factorial(sc.nextInt()));
    }
}

