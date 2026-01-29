package corePrograms.javaProgrammingelements.level2;

/*
 Program to calculate Simple Interest
*/
import java.util.Scanner;

class SimpleInterest {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println(
                "The Simple Interest is " + interest +
                        " for Principal " + principal +
                        ", Rate of Interest " + rate +
                        " and Time " + time
        );
    }
}

