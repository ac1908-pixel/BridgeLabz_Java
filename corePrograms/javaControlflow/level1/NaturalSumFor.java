package corePrograms.javaControlflow.level1;

/*
 Program to find sum of n natural numbers
 using for loop
*/
import java.util.Scanner;

class NaturalSumFor {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 0) {
            int sumFor = 0;

            // for loop summation
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);
        }
    }
}

