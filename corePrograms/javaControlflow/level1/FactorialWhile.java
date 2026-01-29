package corePrograms.javaControlflow.level1;

/*
 Program to find factorial
 using while loop
*/
import java.util.Scanner;

class FactorialWhile {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            int factorial = 1;
            int i = 1;

            // while loop factorial
            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial is " + factorial);
        }
    }
}

