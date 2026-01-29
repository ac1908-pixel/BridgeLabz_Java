package corePrograms.javaControlflow.level1;

/*
 Program to find sum until
 user enters 0
*/
import java.util.Scanner;

class SumUntilZero {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;

        // while loop for summation
        while ((value = input.nextDouble()) != 0) {
            total += value;
        }

        System.out.println("The total sum is " + total);
    }
}

