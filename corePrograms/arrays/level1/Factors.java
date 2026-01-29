package corePrograms.arrays.level1;

/*
 Program to find and store factors of a number
*/
import java.util.Scanner;

class Factors {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;

        // loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                if (index == maxSize) {
                    maxSize *= 2;
                    int[] temp = new int[maxSize];

                    // loop to copy array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }

                factors[index++] = i;
            }
        }

        System.out.println("Factors:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
