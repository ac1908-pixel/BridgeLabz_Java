package corePrograms.javaControlflow.level3;

import java.util.Scanner;

/*
 Program to check whether a number
 is an Armstrong Number
*/
class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        // while loop to extract digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
