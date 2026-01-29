package corePrograms.javaControlflow.level2;

import java.util.Scanner;

/*
 Program to print all factors
 of a given number
*/
class Factors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // loop to find factors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}

