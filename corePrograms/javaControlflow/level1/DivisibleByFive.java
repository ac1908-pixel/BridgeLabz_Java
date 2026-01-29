package corePrograms.javaControlflow.level1;

/*
 Program to check whether a number
 is divisible by 5
*/
import java.util.Scanner;

class DivisibleByFive {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isDivisible = (number % 5 == 0);

        System.out.println(
                "Is the number " + number + " divisible by 5? " + isDivisible
        );
    }
}

