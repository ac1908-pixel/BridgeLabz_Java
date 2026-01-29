package corePrograms.javaControlflow.level1;

/*
 Program to find sum until
 user enters zero or negative
*/
import java.util.Scanner;

class SumWithBreak {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0.0;

        // infinite while loop
        while (true) {
            double value = input.nextDouble();
            if (value <= 0) {
                break;
            }
            total += value;
        }

        System.out.println("The total sum is " + total);
    }
}

