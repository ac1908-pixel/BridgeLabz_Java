package corePrograms.javaControlflow.level1;

/*
 Program to check whether a number
 is positive, negative or zero
*/
import java.util.Scanner;

class NumberType {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

