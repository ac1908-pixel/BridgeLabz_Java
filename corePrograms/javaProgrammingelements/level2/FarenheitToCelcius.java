package corePrograms.javaProgrammingelements.level2;

/*
 Program to convert Fahrenheit to Celsius
*/
import java.util.Scanner;

class FahrenheitToCelsius {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fahrenheit = input.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println(
                "The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius"
        );
    }
}

