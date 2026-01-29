package corePrograms.methods.level2;

import java.util.Scanner;

/*
 Program to find factors of a number and calculate
 sum, sum of squares, and product of factors
*/
class FactorsOperations {

    // method to find factors
    public static int[] findFactors(int number) {
        int count = 0;

        // loop to count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    // method to find sum of factors
    public static int sum(int[] factors) {
        int sum = 0;
        // loop to calculate sum
        for (int f : factors)
            sum += f;
        return sum;
    }

    // method to find product of factors
    public static long product(int[] factors) {
        long product = 1;
        // loop to calculate product
        for (int f : factors)
            product *= f;
        return product;
    }

    // method to find sum of squares of factors
    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        // loop to calculate sum of squares
        for (int f : factors)
            sum += Math.pow(f, 2);
        return sum;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] factors = findFactors(number);

        System.out.println("Factors:");
        for (int f : factors)
            System.out.print(f + " ");

        System.out.println("\nSum = " + sum(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));
        System.out.println("Product = " + product(factors));
    }
}
