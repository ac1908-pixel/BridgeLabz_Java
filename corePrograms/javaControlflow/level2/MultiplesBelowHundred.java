package corePrograms.javaControlflow.level2;

import java.util.Scanner;

/*
 Program to find multiples
 of a number below 100
*/
class MultiplesBelowHundred {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // backward loop from 100 to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}

