package corePrograms.inbuiltfunctions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 Program to display date in different formats
*/
class DateFormatting {

    // main method
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")));
    }
}

