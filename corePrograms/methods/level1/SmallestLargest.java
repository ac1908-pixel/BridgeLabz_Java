package corePrograms.methods.level1;

import java.util.Scanner;

/*
 Program to find smallest and largest of three numbers
*/
class SmallestLargest {

    // method to find smallest and largest
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = a;
        int largest = a;

        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        if (b > largest) largest = b;
        if (c > largest) largest = c;

        return new int[]{smallest, largest};
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);

        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest = " + result[1]);
    }
}

