package corePrograms.methods.level2;

import java.util.Scanner;

/*
 Program to calculate BMI using 2D array
*/
class BMI2D {

    // method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightMeters * heightMeters);
        }
    }

    // method to find BMI status
    public static String[] findStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            if (data[i][2] < 18.5)
                status[i] = "Underweight";
            else if (data[i][2] < 25)
                status[i] = "Normal";
            else if (data[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        return status;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        // loop to take input
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);
        String[] status = findStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][1] + " " + data[i][0] + " " + data[i][2] + " " + status[i]);
        }
    }
}

