package corePrograms.inbuiltfunctions;

import java.time.LocalDate;
import java.util.Scanner;

/*
 Program to perform date arithmetic
*/
class DateArithmetic {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate date = LocalDate.parse(sc.next());

        // add days, months, years
        LocalDate result = date.plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println("Final Date: " + result);
    }
}

