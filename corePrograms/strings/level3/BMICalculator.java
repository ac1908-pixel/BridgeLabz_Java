package corePrograms.strings.level3;

import java.util.Scanner;

/*
 Program to calculate BMI and status of 10 persons
*/

class BMICalculator {

    // method to compute BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100;
            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // method to display result
    public static void display(String[][] res) {
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < res.length; i++)
            System.out.println(res[i][0] + "\t" + res[i][1] + "\t" + res[i][2] + "\t" + res[i][3]);
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        display(calculateBMI(data));
    }
}
