package corePrograms.arrays.level2;

import java.util.Scanner;

/*
 Program to calculate BMI using 2D array
*/
class BMI2D {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        // loop to take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight: ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height: ");
            personData[i][1] = sc.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input");
                i--;
            }
        }

        // loop to calculate BMI
        for (int i = 0; i < n; i++) {
            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5)
                status[i] = "Underweight";
            else if (personData[i][2] < 25)
                status[i] = "Normal";
            else if (personData[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // loop to display
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + " " +
                    personData[i][0] + " " +
                    personData[i][2] + " " +
                    status[i]);
        }
    }
}

