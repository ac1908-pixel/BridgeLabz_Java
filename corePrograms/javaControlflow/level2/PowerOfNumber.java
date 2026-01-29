package corePrograms.javaControlflow.level2;

import java.util.Scanner;

/*
 Program to calculate power of a number
*/
class PowerOfNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;

        // for loop for power calculation
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println("Result is " + result);
    }
}

