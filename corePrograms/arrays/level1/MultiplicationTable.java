package corePrograms.arrays.level1;

/*
 Program to print multiplication table of a number
*/
import java.util.Scanner;

class MultiplicationTable {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int[] table = new int[10];

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // loop to calculate table
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // loop to display table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}

