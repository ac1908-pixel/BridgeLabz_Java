package corePrograms.javaControlflow.level3;

import java.util.Scanner;

/*
 Program to count number of digits
 in an integer
*/
class DigitCount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;

        // loop to count digits
        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
