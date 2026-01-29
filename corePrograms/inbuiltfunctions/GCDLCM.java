package corePrograms.inbuiltfunctions;

import java.util.Scanner;

/*
 Program to calculate GCD and LCM
*/
class GCDLCM {

    // method to find GCD
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // method to find LCM
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}

