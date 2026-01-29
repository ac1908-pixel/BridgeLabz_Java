package corePrograms.javaControlflow.level2;

import java.util.Scanner;

/*
 Program to calculate BMI
 and determine weight status
*/
class BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();
        double heightCm = input.nextDouble();

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        if (bmi < 18.5)
            System.out.println("BMI: " + bmi + " Status: Underweight");
        else if (bmi < 25)
            System.out.println("BMI: " + bmi + " Status: Normal");
        else if (bmi < 30)
            System.out.println("BMI: " + bmi + " Status: Overweight");
        else
            System.out.println("BMI: " + bmi + " Status: Obese");
    }
}

