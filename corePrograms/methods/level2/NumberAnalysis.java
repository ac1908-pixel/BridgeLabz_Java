package corePrograms.methods.level2;

import java.util.Scanner;

/*
 Program to analyze numbers
*/
class NumberAnalysis {

    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // loop to take input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                System.out.println(isEven(arr[i]) ? "Positive Even" : "Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(arr[0], arr[4]);
        System.out.println("Comparison Result = " + result);
    }
}

