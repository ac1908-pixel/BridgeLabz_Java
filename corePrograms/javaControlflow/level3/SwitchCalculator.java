package corePrograms.javaControlflow.level3;

import java.util.Scanner;

/*
 Program to create a calculator
 using switch-case
*/
class SwitchCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();

        // switch-case for arithmetic operations
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                System.out.println("Result: " + (first / second));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}

