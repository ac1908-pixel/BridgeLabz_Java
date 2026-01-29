package corePrograms.arrays.level2;

import java.util.Scanner;

/*
 Program to calculate BMI of persons
*/
class BMI {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // loop to take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight: ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (meters): ");
            height[i] = sc.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input");
                i--;
                continue;
            }
        }

        // loop to calculate BMI
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // loop to display
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
        }
    }
}

