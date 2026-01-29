package corePrograms.javaControlflow.level1;

/*
 Program to find sum of n natural numbers
 using while loop and formula
*/
import java.util.Scanner;

class NaturalSumWhile {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 0) {
            int sumWhile = 0;
            int i = 1;

            // while loop summation
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);
        }
    }
}
