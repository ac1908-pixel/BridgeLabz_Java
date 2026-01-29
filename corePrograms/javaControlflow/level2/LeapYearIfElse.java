package corePrograms.javaControlflow.level2;

import java.util.Scanner;

/*
 Program to check whether a given year
 is a Leap Year using multiple if-else conditions
 based on Gregorian calendar rules
*/
class LeapYearIfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later");
        } else if (year % 400 == 0) {
            System.out.println("Year is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Year is not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}

