package corePrograms.arrays.level1;

/*
 Program to calculate mean height of football players
*/
import java.util.Scanner;

class MeanHeight {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        // loop to take input
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // loop to calculate sum
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean Height = " + mean);
    }
}
