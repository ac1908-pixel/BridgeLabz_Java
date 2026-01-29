package corePrograms.javaProgrammingelements.level2;

/*
 Program to convert Celsius to Fahrenheit
*/
import java.util.Scanner;

class CelsiusToFahrenheit {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius = input.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println(
                "The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit"
        );
    }
}
