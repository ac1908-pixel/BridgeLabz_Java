package corePrograms.javaControlflow.level1;

/*
 Program to find factorial
 using for loop
*/
import java.util.Scanner;

class FactorialFor {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            int factorial = 1;

            // for loop factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial is " + factorial);
        }
    }
}

