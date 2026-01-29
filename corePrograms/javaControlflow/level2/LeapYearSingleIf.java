package corePrograms.javaControlflow.level2;

import java.util.Scanner;

/*
 Program to check Leap Year
 using a single if condition
*/
class LeapYearSingleIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}

