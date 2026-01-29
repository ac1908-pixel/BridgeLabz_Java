package corePrograms.javaControlflow.level3;

import java.util.Scanner;

/*
 Program to check whether a number
 is a Harshad Number
*/
class HarshadNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        // while loop to find sum of digits
        while (originalNumber != 0) {
            sum += originalNumber % 10;
            originalNumber = originalNumber / 10;
        }

        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}
