package corePrograms.arrays.level1;

/*
 Program to analyze numbers and compare first and last elements
*/
import java.util.Scanner;

class NumberAnalysis {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // loop to take input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // loop to analyze numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // compare first and last elements
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are Equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is Greater than last");
        } else {
            System.out.println("First element is Less than last");
        }
    }
}
