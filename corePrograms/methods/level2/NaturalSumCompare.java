package corePrograms.methods.level2;

import java.util.Scanner;

/*
 Program to compare recursive sum and formula sum
*/
class NaturalSumCompare {

    // recursive method
    public static int recursiveSum(int n) {
        if (n == 0)
            return 0;
        return n + recursiveSum(n - 1);
    }

    // formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 0)
            return;

        int rSum = recursiveSum(n);
        int fSum = formulaSum(n);

        System.out.println("Recursive Sum = " + rSum);
        System.out.println("Formula Sum = " + fSum);
        System.out.println("Results Match = " + (rSum == fSum));
    }
}

