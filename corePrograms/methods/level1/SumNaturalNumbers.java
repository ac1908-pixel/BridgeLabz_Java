package corePrograms.methods.level1;

import java.util.Scanner;

/*
 Program to find sum of n natural numbers
*/
class SumNaturalNumbers {

    // method to calculate sum
    public static int calculateSum(int n) {
        int sum = 0;

        // loop to calculate sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + calculateSum(n));
    }
}
