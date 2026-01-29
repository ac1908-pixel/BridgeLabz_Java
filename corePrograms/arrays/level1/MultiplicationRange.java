package corePrograms.arrays.level1;

/*
 Program to print multiplication table from 6 to 9
*/
import java.util.Scanner;

class MultiplicationRange {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int[] result = new int[4];

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // loop from 6 to 9
        for (int i = 6; i <= 9; i++) {
            result[i - 6] = number * i;
        }

        // loop to display
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[i - 6]);
        }
    }
}

