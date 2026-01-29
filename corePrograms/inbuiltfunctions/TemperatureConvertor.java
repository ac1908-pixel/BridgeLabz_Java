package corePrograms.inbuiltfunctions;

import java.util.Scanner;

/*
 Program for temperature conversion
*/
class TemperatureConvertor {

    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();

        System.out.println("Celsius to Fahrenheit: " + cToF(temp));
        System.out.println("Fahrenheit to Celsius: " + fToC(temp));
    }
}
