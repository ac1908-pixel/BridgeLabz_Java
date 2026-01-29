package corePrograms.arrays.level2;

import java.util.Scanner;

/*
 Program to reverse a number using arrays
*/
class ReverseNumber {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // loop to count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] reverse = new int[count];

        temp = number;

        // loop to store digits
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // loop to reverse array
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        // loop to display reverse
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
    }
}

