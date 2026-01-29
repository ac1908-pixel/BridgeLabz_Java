package corePrograms.inbuiltfunctions;

import java.util.Scanner;

/*
 Program to generate Fibonacci sequence
*/
class Fibonacci {

    // method to generate fibonacci
    static void generate(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        generate(sc.nextInt());
    }
}

