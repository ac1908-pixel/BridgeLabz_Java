package corePrograms.methods.level1;

import java.util.Scanner;

/*
 Program to check number sign
*/
class NumberSign {

    // method to check sign
    public static int checkNumber(int number) {
        if (number > 0)
            return 1;
        else if (number < 0)
            return -1;
        else
            return 0;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Result = " + checkNumber(number));
    }
}

