package corePrograms.arrays.level2;

import java.util.Scanner;

/*
 Program to find frequency of digits
*/
class DigitFrequency {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int[] freq = new int[10];

        // loop to count frequency
        while (number != 0) {
            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }

        // loop to display frequency
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " = " + freq[i]);
            }
        }
    }
}
