package corePrograms.inbuiltfunctions;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 Program to display current time in different time zones
*/
class TimeZones {

    // main method
    public static void main(String[] args) {

        // current time in GMT
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));

        // current time in IST
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // current time in PST
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("GMT Time: " + gmt);
        System.out.println("IST Time: " + ist);
        System.out.println("PST Time: " + pst);
    }
}

