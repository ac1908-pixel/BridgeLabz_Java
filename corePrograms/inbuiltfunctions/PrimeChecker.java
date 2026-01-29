package corePrograms.inbuiltfunctions;

import java.util.Scanner;

/*
 Program to check prime number
*/
class PrimeChecker {

    // method to check prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
    }
}
